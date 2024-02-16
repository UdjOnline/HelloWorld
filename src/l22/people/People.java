package l22.people;

public class People {
    protected String gender; protected String name; protected int age; protected int weight;

    public People (String gender, String name, int age, int weight) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Это человек:");
    }

    public void applySkill() {
        System.out.println("Я совсем ничего не умею...");
    }

    public String toString() {
        return gender + ": " + this.name + ", " + age + ", " + weight + ".";
    }
}
