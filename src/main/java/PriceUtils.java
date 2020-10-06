import domain.*;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PriceUtils {

    public Cycle calculatePriceAndConstructCycle(JSONObject jsonObject) {
        Cycle result = new Cycle();
        Double totalCost = 0D;
        if(jsonObject.get(Constants.wheels) != null ) {
            Wheels wheels = getWheelsProperties((JSONObject) jsonObject.get(Constants.wheels));
            result.setWheels(wheels);
            totalCost += wheels.getPrice();
        }
        if(jsonObject.get(Constants.chain) != null) {
            Chain chain = getChainProperties((JSONObject) jsonObject.get(Constants.chain));
            result.setChain(chain);
            totalCost += chain.getPrice();
        }
        if(jsonObject.get(Constants.frame) != null) {
            Frame frame = getFrameProperties((JSONObject) jsonObject.get(Constants.frame));
            result.setFrame(frame);
            totalCost += frame.getPrice();
        }
        if(jsonObject.get(Constants.handleBar) != null) {
            HandleBar handleBar = getHandleBarProperties((JSONObject) jsonObject.get(Constants.handleBar));
            result.setHandleBar(handleBar);
            totalCost += handleBar.getPrice();
        }
        if(jsonObject.get(Constants.seating) != null) {
            Seating seating = getSeatProperties((JSONObject) jsonObject.get(Constants.seating));
            result.setSeating(seating);
            totalCost += seating.getPrice();
        }
        result.setPrice(totalCost);
        return result;
    }


    public Chain getChainProperties(JSONObject object) {
        List<Attribute> attributes = new LinkedList<>();
        Iterator<String> keys = object.keySet().iterator();
        Double totalCost = 0D;
        while(keys.hasNext()) {
            String key = keys.next();
            if (object.get(key) instanceof String) {
                String value = (String) object.get(key);
                Double price = getPrice(value, key);
                totalCost += price;
                attributes.add(new Attribute(value,price,key));
            }
        }
        Chain chain = new Chain(attributes);
        chain.setPrice(totalCost);
        return chain;
    }

    public Frame getFrameProperties(JSONObject object) {
        List<Attribute> attributes = new LinkedList<>();
        Iterator<String> keys = object.keySet().iterator();
        Double totalCost = 0D;
        while(keys.hasNext()) {
            String key = keys.next();
            if (object.get(key) instanceof String) {
                String value = (String) object.get(key);
                Double price = getPrice(value, key);
                totalCost += price;
                attributes.add(new Attribute(value,price,key));
            }
        }
        Frame frame = new Frame(attributes);
        frame.setPrice(totalCost);
        return frame;
    }

    public HandleBar getHandleBarProperties(JSONObject object) {
        List<Attribute> attributes = new LinkedList<>();
        Iterator<String> keys = object.keySet().iterator();
        Double totalCost = 0D;
        while(keys.hasNext()) {
            String key = keys.next();
            if (object.get(key) instanceof String) {
                String value = (String) object.get(key);
                Double price = getPrice(value, key);
                totalCost += price;
                attributes.add(new Attribute(value,price,key));
            }
        }
        HandleBar handleBar = new HandleBar(attributes);
        handleBar.setPrice(totalCost);
        return handleBar;
    }

    public Seating getSeatProperties(JSONObject object) {
        List<Attribute> attributes = new LinkedList<>();
        Iterator<String> keys = object.keySet().iterator();
        Double totalCost = 0D;
        while(keys.hasNext()) {
            String key = keys.next();
            if (object.get(key) instanceof String) {
                String value = (String) object.get(key);
                Double price = getPrice(value, key);
                totalCost += price;
                attributes.add(new Attribute(value,price,key));
            }
        }

        Seating seating = new Seating(attributes);
        seating.setPrice(totalCost);
        return seating;
    }

    public Wheels getWheelsProperties(JSONObject object) {
        List<Attribute> attributes = new LinkedList<>();
        Iterator<String> keys = object.keySet().iterator();
        Double totalCost = 0D;
        while(keys.hasNext()) {
            String key = keys.next();
            if (object.get(key) instanceof String) {
                String value = (String) object.get(key);
                Double price = getPrice(value, key);
                totalCost += price;
                attributes.add(new Attribute(value,price,key));
            }
        }
        Wheels wheels = new Wheels(attributes);
        wheels.setPrice(totalCost);
        return wheels;
    }

    public Double getPrice(String model,String key) {
        if (model.equals("yes") || model.equals("default")){
            return 200D;
        } else if(model.equals("no")) {
            return 10D;
        }
        return 23D;
    }
}
