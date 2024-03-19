package l37_collection4.ex1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IterableIteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Получение итератора
        Iterator<String> iterator = fruits.iterator();

        // использование Iterator для перебора списка
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}