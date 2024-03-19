package l34_collection1.slides.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание списка ArrayList
        List<String> list = new ArrayList<>();
        // Добавление элемента "Apple" в список
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.sort((o1, o2) -> o1.length() - o2.length());

        // Получение итератора для списка
        Iterator<String> iterator = list.iterator();

        // Пока в списке есть элементы...
        while (iterator.hasNext()) {
            // Получение следующего элемента списка
            String fruit = iterator.next();

            // Вывод текущего элемента (фрукта) нв экран
            System.out.println(fruit);
        }
    }
}