package l24_object_string.animal;

public class Animal {
    public String type;
    String name;
    public int age;
    int weight;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // сравниваем объект, если равен себеб то true
            return true;
        if (obj == null || getClass() != obj.getClass()) // проверка объекта на равенство нулю и на в одном ли они классе?
            return false;

        Animal animal = (Animal) obj; // преобразование к типу Animal
        return age == animal.age && (name == null ? animal.name == null : name.equals(animal.name));
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

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