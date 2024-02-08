package l17.transport;

public class Bike {
    String brendBike; String typeBike; String colorBike; int priceBike;
    public Bike(String brendBike, String typeBike, String colorBike, int priceBike) {
        this.brendBike = brendBike;
        this.typeBike = typeBike;
        this.colorBike = colorBike;
        this.priceBike = priceBike;
    }
    public String toString() {
        return "Bike: " + brendBike + ", " + typeBike + ", " + colorBike + ", " + priceBike + " USD.";
    }
}
