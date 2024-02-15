package l22;

import l22.animal.Cat;
import l22.animal.Dog;
import l22.people.Man;
import l22.people.Woman;

public class Main {
    public static void main(String[] args) {
        Man eugeny = new Man("Eugeny", 45);
        Man denis = new Man ("Denis", 44);
        eugeny.printInfo();
        System.out.println(eugeny);
        denis.printInfo();
        System.out.println(denis);

        Woman liubov = new Woman("Liubov", 43);
        Woman dominika = new Woman("Dominika", 17);
        liubov.printInfo();
        System.out.println(liubov);
        dominika.printInfo();
        System.out.println(dominika);

        Cat marusya = new Cat("Маруся",2,2);
        Cat persik = new Cat ("Персик", 3, 3);
        marusya.printInfo();
        System.out.println(marusya);
        persik.printInfo();
        System.out.println(persik);

        Dog bobik = new Dog ("Бобик", 4, 3);
        Dog vesta = new Dog("Веста", 4, 5);
        bobik.printInfo();
        System.out.println(bobik);
        vesta.printInfo();
        System.out.println(vesta);
    }
}