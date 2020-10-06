package domain;

import java.util.LinkedList;
import java.util.List;

public class AbstractAttributes {
    List<Attribute> attributes = new LinkedList<>();

    public AbstractAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
