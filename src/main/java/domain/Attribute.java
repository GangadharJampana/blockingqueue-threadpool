package domain;

public class Attribute {
    private String model;
    private Double price;

    private String name;

    public Attribute(String model, Double price, String name) {
        this.model = model;
        this.price = price;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
