package l26_abstraction;

// абстрактый класс
abstract class Animal {
    abstract void makeSound(); // абстрактый метод
    void breathe() {System.out.println("Animal is breathing.");}
}

class Dog extends Animal {
    void swim() {System.out.println("Dog is swimming");}

    @Override
    void makeSound() {System.out.println("Dog says: Woof.");}
}

class Cat extends Animal {
    @Override
    void makeSound() {System.out.println("Cat says: Meow.");}
}

// abstract class AnimalInSky extends Animal {}

class TestAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.breathe();
        ((Dog) dog).swim();

        cat.makeSound();
        cat.breathe();
    }
}