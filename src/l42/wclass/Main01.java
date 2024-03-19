package l42.wclass;

import java.util.List;
import java.util.Objects;


class Cat {
    public String name;


    public Cat(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        Cat cat = (Cat) o;


        return Objects.equals(name, cat.name);
    }


    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }


    @Override
    public String toString() {
        return name;
    }
}


public class Main01 {
    public static void main(String[] args) {
        // Напечатать “Хэш таблицу” по коллекции объектов


        List<Cat> cats = List.of(
                new Cat("Marsik"),
                new Cat("Barsik"),
                new Cat("Masik"),
                new Cat("Boris"),
                new Cat("Matroskin")
        );


        cats.stream()  // источник, создаем начало конвеера
                .forEach(c -> System.out.println(c.hashCode() + " | " + c));


        System.out.println("------------");
        // или так

        cats.stream()  // источник
                .peek(c -> System.out.print(c.hashCode() + " | "))  // промежуточная операция
                .forEach(c -> System.out.println(c));  // терминальная операция

        // 9239293 | Marsik
        // 5849845 | Barsik
    }
}