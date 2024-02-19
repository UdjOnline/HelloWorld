package l24;

import l24.animal.*;
import l24.people.*;
import l24.transport.*;

public class Main {
    public static void main(String[] args) {
        Man eugeny1 = new Man("Eugeny", 45, 82);
        Man eugeny2 = new Man("Eugeny", 45, 82);

        eugeny1.printInfo();
        System.out.println(eugeny1);
        eugeny2.printInfo();
        System.out.println(eugeny2);
        eugeny2.applySkill();

        System.out.println("Сравнение объектов: " + eugeny1.equals(eugeny2));
        System.out.println(eugeny1.hashCode());
        System.out.println(eugeny2.hashCode());

        Woman liubov = new Woman("Liubov", 43, 72);
        Woman dominika = new Woman("Dominika", 17, 62);
        liubov.printInfo();
        System.out.println(liubov);
        liubov.applySkill();
        dominika.printInfo();
        System.out.println(dominika);

        System.out.println("Сравнение объектов: " + liubov.equals(dominika));
        System.out.println(liubov.hashCode());
        System.out.println(dominika.hashCode());

        Cat marusya = new Cat("Маруся", 3, 3);
        Cat persik = new Cat("Персик", 3, 3);
        marusya.printInfo();
        System.out.println(marusya);
        persik.printInfo();
        System.out.println(persik);

        System.out.println("Сравнение объектов: " + marusya.equals(persik));
        System.out.println(marusya.hashCode());
        System.out.println(persik.hashCode());

        Animal[] pet = new Animal[2];
        pet[0] = new Dog("Бобик", 4, 3);
        pet[1] = new Dog("Веста", 4, 5);

        for (Animal animal : pet) {
            animal.printInfo();
        }
        System.out.println(pet[0]);
        System.out.println(pet[1]);

        System.out.println("Сравнение объектов: " + pet[0].equals(pet[1]));
        System.out.println(pet[0].hashCode());
        System.out.println(pet[1].hashCode());

        Bike bike = new Bike ("Bike", "Tech Team", "white", 2023);
        System.out.println(bike);

        Car car = new Car ("Car", "black", 2023);
        System.out.println(car);

        System.out.println("Сравнение объектов: " + bike.equals(car));
        System.out.println(bike.hashCode());
        System.out.println(car.hashCode());
    }
}