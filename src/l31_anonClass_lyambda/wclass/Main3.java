package l31_anonClass_lyambda.wclass;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface // аннотация помогает гарантировать, что интерфейс всем теребованиям
interface Calculator { // создаём интерфейс с одним абстрактым методом - operate
    int operate(int a, int b); // этот метод принимает два аргумента и возвращает результат
}

class Main30 {
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int result = add.operate(2, 2);
        System.out.println ("Операция сложения: 2 + 2 = " + result);

        Calculator subtract = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a-b;
            }
        };
        int result1 = subtract.operate(2,2);
        System.out.println("Операция вычитания: 2 - 2 = " + result1);

        Calculator multiply = new Calculator() {
            @Override
            public int operate(int a, int b) {return a*b;}
        };
        int result2 = multiply.operate(2,2);
        System.out.println("Операция умножения: 2 x 2 = " + result2);

        Calculator divide = new Calculator() {
            @Override
            public int operate(int a, int b) {return a/b;}
        };
        int result3 = divide.operate(2,2);
        System.out.println("Операция деления: 2 / 2 = " + result3);
    }
}

class Main3 {
    public static void main(String[] args) { // реализация лямбда-выражения на основе интерфейса Calculator:
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        System.out.println("Сумма 2 и 2 равна " + add.operate(2, 2) + ";");
        System.out.println("Разность 2 и 2 равна " + subtract.operate(2, 2) + ";");
        System.out.println("Умножение 2 на 2 равно " + multiply.operate(2, 2) + ";");
        System.out.println("Деление 2 на 2 равно  " + divide.operate(2,2) + ".");

        List<String> strings = Arrays.asList("one", "two", "three"); //пример использования л-в с потоками данных
        System.out.println("__________________________________________");
        System.out.println("Фильтрация строк, начинающихся с символа t:");
        // создание потока данных из списка строк
        strings.stream()
                // фильтрация строк, начинающихся с "t"
                .filter(s -> s.startsWith("t"))
                // вывод отфильтрованных строк
                .forEach(System.out::println);
    }
}