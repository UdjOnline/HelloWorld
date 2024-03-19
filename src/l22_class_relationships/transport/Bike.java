package l22_class_relationships.transport;

public class Bike extends Transport {
    String brendBike;

    public Bike (String type, String brendBike, String color) {
        super(type, color);
        this.brendBike = brendBike;
    }

    public String toString() {
        return super.toString() + brendBike;
    }
}