package l25_polimorfism;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound () {
        System.out.println("The Dog say Woof!"); // Собака говорит Гав
    }
}

class Cat extends Animal {
    @Override
    void makeSound () {
        System.out.println("The Cat say Meow!"); // Кошка говорит Мяу
    }
}

public class PolymorphismExampleAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(), new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound(); // запускаем метод makeSound
        }
    }
}