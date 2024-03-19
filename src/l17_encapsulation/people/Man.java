package l17_encapsulation.people;

import java.util.Scanner;

public class Man {
    String name; int age; int weight;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у мужчины? Введите, пожалуйста, ответ: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }
    public Man(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        return "Man: | " + name + " | " + age + " | " + weight + " kg. | " + chromosomNumber;
    }
}