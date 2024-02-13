package l17.animal;
import java.util.Scanner;

public class Dog {
    String name; int age; int weight;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у собаки? Введите, пожалуйста, ответ: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        return "Dog: | " + name + " | " + age + " | " + weight + " kg. | " + chromosomNumber;
    }
}
