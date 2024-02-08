import l17.animal.Cat;
import l17.animal.Cow;
import l17.animal.Dog;
import l17.people.Man;
import l17.people.Woman;
import l17.transport.Bike;
import l17.transport.Bus;
import l17.transport.Car;

public class L17Main {
    public static void main(String[] args) {
        Man eugeny = new Man("Eugeny", 45, 74);
        System.out.println(eugeny);

        Woman diana = new Woman("Diana", 30, 45);
        System.out.println(diana);

        Cat pers = new Cat("Pers", 2, 5);
        System.out.println(pers);

        Cow avrora = new Cow("Avrora",2, 410);
        System.out.println(avrora);

        Dog chelsi = new Dog("Teddi", 2,32);
        System.out.println(chelsi);

        Bike techTeam = new Bike("Tech Team", "mountain", "red", 450);
        System.out.println(techTeam);

        Bus noeplan = new Bus("Neoplan", "passenger", "white", 112000);
        System.out.println(noeplan);

        Car bmw = new Car("BMW", "SUV", "black", 38999);
        System.out.println(bmw);
    }
}
