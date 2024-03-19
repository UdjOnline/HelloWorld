package l34_collection1.slides.ex2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  Создание списка ArrayList:
        List<String> arrayList = new ArrayList<>();

        // Добавление "Apple" в ArrayList:
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Lemon");

        // Добавление "Banana_2" по индексу 2:
        arrayList.add(2, "Banana_2");

        // Удаление по индексу 3:
        arrayList.remove(3);

        arrayList.size();

        // Создание списка LinkedList
        List<String> linkedList = new LinkedList<>();

        // Добавление "Cherry" в LinkedList
        linkedList.add("Cherry");
        linkedList.add("Date");

        linkedList.add(0, "Cherry_2");
        linkedList.remove("Cherry");

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        System.out.println(linkedList);
    }
}
