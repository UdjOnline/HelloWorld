package l17.transport;

public class Car {
    String brendCar; String typeCar; String colorCar; int priceCar;

    public Car(String brendCar, String typeCar, String colorCar, int priceCar) {
        this.brendCar = brendCar;
        this.typeCar = typeCar;
        this.colorCar = colorCar;
        this.priceCar = priceCar;
    }
    public String toString() {
        return "Car: " + brendCar + ", " + typeCar + ", " + colorCar + ", " + priceCar + " USD.";
    }
}
