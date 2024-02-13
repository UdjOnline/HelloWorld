import l17.transport.Car;
import l17.CarArrayList;

public class L18Main {
    public static void main(String[] args) {
        Car bmw = new Car("bmw", "SUV", "black", 38999);
        Car vw = new Car("vw", "sedan", "red", 12999);
        Car citroen = new Car("citroen", "sedan", "white", 10999);
        Car audi = new Car("audi", "SUV", "black", 18999);
        Car ford = new Car("ford", "sedan", "blue", 14999);

        CarArrayList garage = new CarArrayList();
        garage.add(bmw);
        garage.add(vw);
        garage.add(citroen);
        garage.add(audi);
        garage.add(ford);

        garage.removeByIndex(bmw);
        garage.getByIndex(bmw);


        System.out.println(garage);
    }
}
