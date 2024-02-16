package l22.animal;

public class Animal {
   public String type;
   String name;
   public int age;
   int weight;

    public Animal(String type, String name, int age, int weight) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Это животное:");
    }

    public String toString() {
        return type + ": " + name + ", " + age + ", " + weight + ".";
    }
}