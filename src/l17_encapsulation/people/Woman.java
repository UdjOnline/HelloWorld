package l17_encapsulation.people;

import java.util.Scanner;

public class Woman {
    String name; int age; int weight;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у женщины? Введите, пожалуйста, ответ: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }
    public Woman (String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        return "Woman: | " + name + " | " + age + " | " + weight + " kg. | " + chromosomNumber;
    }
}
