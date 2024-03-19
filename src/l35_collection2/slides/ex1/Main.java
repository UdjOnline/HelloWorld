package l35_collection2.slides.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // переопределяем метод сравнения, основанный на возрасте
    @Override
    public int compareTo(Person anotherPerson) {
        return this.age - anotherPerson.age;
    }
}

class NameComparator implements Comparator<Person> {
    // сравнение основано на именах
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.compareTo(p2);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Eugeny", 45));
        list.add(new Person("Karl", 28));
        list.add(new Person("Dominika", 17));

        System.out.println(list);

        list.sort((p1, p2) -> p1.age - p2.age);

        list.sort(new PersonComparator());
        list.sort((p1, p2) -> p1.compareTo(p2));
    }
}