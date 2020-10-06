package domain;

import java.util.List;

public class Seating extends AbstractAttributes{
    private Double price = 0D;
    public Seating(List<Attribute> attributes) {
        super(attributes);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
