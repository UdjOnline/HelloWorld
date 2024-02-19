package l24.transport;

public class Bike extends Transport {
    String brendBike;

    public Bike (String type, String brendBike, String color, int productionYear) {
        super(type, color, productionYear);
        this.brendBike = brendBike;
    }

    public String toString() {
        return super.toString() + brendBike;
    }
}