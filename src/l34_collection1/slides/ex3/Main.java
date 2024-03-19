package l34_collection1.slides.ex3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создание хеш-сета для строк:
        Set<String> hashSet = new HashSet<>();

        // Добавление "Apple" в хеш-сет:
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Будет присутствовать один раз из-за уникальности элементов в хеш-таблице:
        hashSet.size();

        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println((hashSet.hashCode()));
    }
}