

import org.json.simple.JSONObject;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        String filePath = null;
        if (args.length > 0) {
            filePath = args[0];
            System.out.println("using args");
        } else {
            filePath = "src/main/resources/cycle.json";
            System.out.println("using default");
        }
        JSONObject config = JsonReader.readFromFile(filePath);
        Thread thread = new Thread(new ConstructCycle(config));
        thread.start();
        /*List<JSONObject> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(config);
        }
        calculatePriceUsingThreadExecutor(list);*/
    }


    public static void calculatePriceUsingThreadExecutor(List<JSONObject> list) {
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(50);

        CustomThreadPoolExecutor executor = new CustomThreadPoolExecutor(5,
                10, 5000, TimeUnit.MILLISECONDS, blockingQueue);

        executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r,
                                          ThreadPoolExecutor executor) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                executor.execute(r);
            }
        });
        executor.prestartAllCoreThreads();

        for (JSONObject jsonObject : list) {
            executor.execute(new ConstructCycle(jsonObject));
        }
        executor.shutdown();
        return;

    }
}
