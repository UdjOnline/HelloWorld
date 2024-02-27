package l29_ArrayList_LinkedList;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Создаём экземпляр LinkedList:
        LinkedList<String> names = new LinkedList<>();

        // добавление элементов:
        names.add("Alice");
        names.add("Bob");

        // добавление в начало списка:
        names.addFirst("Diana");

        // добавление в конец списка:
        names.addLast("Charlie");

        // доступ к элементам:
        // получение первого элемента:
        String firstElement = names.getFirst();

        // получение последнего элемента:
        String lastElement = names.getLast();

        System.out.println("First: " + firstElement + ", Last: " + lastElement + ".");

        // удаление элементов:
        names.removeFirst(); // удаление первого элемента:
        names.removeLast(); // удаление последнего элемента:

        // перебор элементов с использованием улучшенного цикла for:
        for (String name : names) {
            System.out.println(name);
        }

        // добавление элемента по индексу:
        names.add(1, "Eve");


    }
}
