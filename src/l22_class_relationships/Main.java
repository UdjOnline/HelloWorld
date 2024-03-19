package l22_class_relationships;

import l22_class_relationships.transport.Car;
import l22_class_relationships.transport.Bike;
import l22_class_relationships.animal.Animal;
import l22_class_relationships.animal.Cat;
import l22_class_relationships.animal.Dog;
import l22_class_relationships.people.Man;
import l22_class_relationships.people.Woman;


public class Main {
    public static void main(String[] args) {
        Man eugeny = new Man("Eugeny", 45, 82);
        Man denis = new Man("Denis", 44, 90);

        eugeny.printInfo();
        System.out.println(eugeny);
        denis.printInfo();
        System.out.println(denis);
        denis.applySkill();

        Woman liubov = new Woman("Liubov", 43, 72);
        Woman dominika = new Woman("Dominika", 17, 62);
        liubov.printInfo();
        System.out.println(liubov);
        liubov.applySkill();
        dominika.printInfo();
        System.out.println(dominika);

        Cat marusya = new Cat("Маруся", 2, 2);
        Cat persik = new Cat("Персик", 3, 3);
        marusya.printInfo();
        System.out.println(marusya);
        persik.printInfo();
        System.out.println(persik);

        /** Dog bobik = new Dog ("Бобик", 4, 3);
         Dog vesta = new Dog("Веста", 4, 5);
         bobik.printInfo();
         System.out.println(bobik);
         vesta.printInfo();
         System.out.println(vesta);
         */

        Animal[] pet = new Animal[2];
        pet[0] = new Dog("Бобик", 4, 3);
        pet[1] = new Dog("Веста", 4, 5);

        for (Animal animal : pet) {
            animal.printInfo();
        }
        System.out.println(pet[0]);
        System.out.println(pet[1]);

        Bike bike = new Bike ("Bike", "Tech Team", "white");
        System.out.println(bike);

        Car car = new Car ("Car", "black");
        System.out.println(car);
    }
}