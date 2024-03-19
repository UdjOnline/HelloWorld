package l42.wclass;

import java.util.stream.Stream;

public class Main0 {
    public static void main(String[] args) {
        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };

        long lemonCount = Stream
                .of(strings) // источник
                .filter(s -> s.equals("lemon")) // промежуточная операция
                //.filter(s -> s.equals("banana")) // фильтрация с бананом
                .count(); //терминальная операция подсчёта количества
        System.out.println("Lemon count: " + lemonCount);
    }
}