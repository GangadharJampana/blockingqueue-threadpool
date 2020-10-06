package domain;

public class Cycle {
    private Chain chain;
    private Frame frame;
    private HandleBar handleBar;
    private Seating seating;
    private Wheels wheels;
    private Double price;


    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public HandleBar getHandleBar() {
        return handleBar;
    }

    public void setHandleBar(HandleBar handleBar) {
        this.handleBar = handleBar;
    }

    public Seating getSeating() {
        return seating;
    }

    public void setSeating(Seating seating) {
        this.seating = seating;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
