/**
 * Это класс, описывающий кота.
 * Класс позваоляет создавать сколько угодно объектов этого класса
 * (т.е. сколько угодно котов).
 */
public class CatAll {
    /**
     * Переменные, определённые внутри класса, но не внутри метода,
     * называются полямя класса и определяют, какие характеристики
     * или какое состояние будет у объектов, созданных на базе этого класса.
     * Т.е. то, каким является наш объект.
     */
    String color;
    int age;
    static int legs_count = 4; //статическая переменная
    boolean hungry; //true если кот голоден, false - если сыт

    /**
     * Методы определяют поведение объектов, т.е. то, что объект умеет делать.
     */
    public void sayMeow() {
        System.out.println(color + "Кот говорит: Мяу!");
    }

    /**
     * Статический метод принадлежит классу и вызывается у класса, а не у объекта
     */
    public static void info() {
        System.out.println("Все коты любят покушать");
    }

    public void isCatHungry() {
        if (hungry) {
            System.out.println(color + " кот голоден!");
        } else {
            System.out.println(color + " кот сыт и доволен!");
        }
    }

    public void feedCat() {
        hungry = false;
    }

public static class TestCat {
    public static  void main(String[] args) {
        CatAll cat1 = new CatAll();
        cat1.color = "Чёрный";
        CatAll cat2 = new CatAll();
        cat2.color = "Рыжий";

        System.out.println("Цвет первого кота - " + cat1.color);
        System.out.println("Цвет ыторого кота - " + cat2.color);
        System.out.println("Первый кот - " + cat1);

        cat1.age = 7;
        cat2.age = 3;
        System.out.println("Возрпаст первого кота - " + cat1.age);
        System.out.println("Возрпаст второго кота - " + cat2.age);

        System.out.println("Просим котов помяукать");
        cat1.sayMeow();
        cat2.sayMeow();

        //cat1.legs_count = 5;
        //System.out.println("Количество лап - " + cat1.legs_count);

        cat2.age = 12;
        System.out.println("Возрпаст второго кота - " + cat2.age);

        cat1.hungry = true;
        cat2.hungry = true;

        System.out.println("Проверяем состояник котов:");
        cat1.isCatHungry();
        cat2.isCatHungry();

        System.out.println("Кормим первого кота и снова проверяем состояние");
        cat1.feedCat();
        cat1.isCatHungry();
        cat2.isCatHungry();

        System.out.println("Кормим второго кота и снова проверяем состояние");
        cat2.feedCat();
        cat1.isCatHungry();
        cat2.isCatHungry();
    }
}}