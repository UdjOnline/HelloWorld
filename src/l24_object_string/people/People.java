package l24_object_string.people;

public class People {
    protected String gender; protected String name; protected int age; protected int weight;

    public People (String gender, String name, int age, int weight) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        People people = (People) obj;
        return age == people.age && (name == null ? people.name == null : name.equals(people.name));
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
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