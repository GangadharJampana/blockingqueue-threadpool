import domain.*;
import org.json.simple.JSONObject;

public class ConstructCycle implements Runnable
{
    private JSONObject jsonObject = null;

    public ConstructCycle(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getName() {
        return this.jsonObject;
    }

    @Override
    public void run() {
        try {
            PriceUtils priceUtils = new PriceUtils();
            outputPrice(priceUtils.calculatePriceAndConstructCycle(jsonObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void outputPrice(Cycle cycle) {
        System.out.println("cycle total cost = " + cycle.getPrice());
        System.out.println("\n\t printing individual components cost\n");
        if(cycle.getChain() != null) {
            System.out.println("\n\t printing chain components cost\n");
            Chain chain = cycle.getChain();
            for (Attribute attribute : chain.getAttributes()) {
                System.out.println("name : " + attribute.getName()+ "\tmodel : " + attribute.getModel() + "\tprice : " + attribute.getPrice());
            }
            System.out.println("\t total cost for the chain components : " + chain.getPrice());
        }
        if(cycle.getFrame() != null) {
            System.out.println("\n\t printing frame components cost\n");
            Frame frame = cycle.getFrame();
            for (Attribute attribute : frame.getAttributes()) {
                System.out.println("name : " + attribute.getName()+ "\tmodel : " + attribute.getModel() + "\tprice : " + attribute.getPrice());
            }
            System.out.println("\t total cost for the frame components : " + frame.getPrice());
        }
        if(cycle.getHandleBar() != null) {
            System.out.println("\n\t printing handle bar components cost\n");
            HandleBar handleBar = cycle.getHandleBar();
            for (Attribute attribute : handleBar.getAttributes()) {
                System.out.println("name : " + attribute.getName()+ "\tmodel : " + attribute.getModel() + "\tprice : " + attribute.getPrice());
            }
            System.out.println("\t total cost for the handleBar components : " + handleBar.getPrice());
        }
        if(cycle.getSeating() != null) {
            System.out.println("\n\t printing seating components cost\n");
            Seating seating = cycle.getSeating();
            for (Attribute attribute : seating.getAttributes()) {
                System.out.println("name : " + attribute.getName()+ "\tmodel : " + attribute.getModel() + "\tprice : " + attribute.getPrice());
            }
            System.out.println("\t total cost for the seating components : " + seating.getPrice());
        }
        if(cycle.getWheels() != null) {
            System.out.println("\n\t printing wheel components cost\n");
            Wheels wheels = cycle.getWheels();
            for (Attribute attribute : wheels.getAttributes()) {
                System.out.println("name : " + attribute.getName()+ "\tmodel : " + attribute.getModel() + "\tprice : " + attribute.getPrice());
            }
            System.out.println("\t total cost for the wheels components : " + wheels.getPrice());
        }
    }
}