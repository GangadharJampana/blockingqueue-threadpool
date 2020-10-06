package domain;

import java.util.List;

public class Wheels extends AbstractAttributes{

    private Double price = 0D;

    public Wheels(List<Attribute> attributes) {
        super(attributes);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
