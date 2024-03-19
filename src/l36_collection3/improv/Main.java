package l36_collection3.improv;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String data = "agagaggagagagag!@#$QETUJIKOJJJJKKKLKjkjhcdhvdfbj";
        System.out.println("Изначально: " + data);
        clear(data);
    }

    public static void clear(String data) {
        // создваём set
        Set<Character> chars = new HashSet<>();
        // добавляем каждый символ стооки в этот set
        for (char c : data.toCharArray()) {

            //добавятся символы без дубоирования
            chars.add(c);
        }
        List<Character> charList = new ArrayList<>(chars);
        Collections.sort(charList);
        System.out.println(chars);
    }
}
