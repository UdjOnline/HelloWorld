package l22_class_relationships.transport;

public class Transport {
    protected String type; protected String color;

    public Transport (String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String toString() {
        return type + ", " + color + ".";
    }
}