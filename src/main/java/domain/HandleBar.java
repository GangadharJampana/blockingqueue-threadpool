package domain;

import java.util.List;

public class HandleBar extends AbstractAttributes{

    private Double price = 0D;

    public HandleBar(List<Attribute> attributes) {
        super(attributes);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
