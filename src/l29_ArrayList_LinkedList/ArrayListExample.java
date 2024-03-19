package l29_ArrayList_LinkedList;

import java.util.ArrayList; // Импорт класса ArrayList

class ArrayListExample {
    public static void main(String[] args) {
        // Создание экземпляра класса ArrayList для хранения строк
        ArrayList<String> fruits = new ArrayList<String>();

        // Добавление элементов в список массива
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add(0,"Date");

        // Доступ к элементу массива по индексу (Например, получение второго элемента, индекс 1)
        System.out.println("Element at index 1: " + fruits.get(1)); // Выводим в терминал: "Banana"

        // Изменение элемента (замена элемента на индексе 2 на "Blackberry"
        fruits.set(2, "Blackberry");

        // Удаление элемента по индексу (удаление элемента на индексе 3)
        fruits.remove(3);

        // Удаление элемента по объекту (удаление "Apple"
        fruits.remove("Apple");

        // Перебор элементов с использованием улучшенного цикла for
        System.out.println("Current list: ");
        for (String fruit : fruits) {
            System.out.println(fruit); // Выводит оставшиеся элементы списка
        }

        // Проверка наличия элемента в списке:
        if (fruits.contains("Blackberry")) {
            System.out.println("Blackberry is in the list");
        }

        // Получение размера списка (количество элементов):
        System.out.println("Size of the list: " + fruits.size());

        // Очистка списка:
        fruits.clear();
        System.out.println("List cleared. Size of the list: " + fruits.size()); // выводит 0.
    }
}
class Main {
    ArrayList<String> fruits;

    Main() {
        this.fruits = new ArrayList<String>();
    }

    void add(String str) {
        fruits.add(str);
    }
}