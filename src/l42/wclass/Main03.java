package l42.wclass;

import java.util.stream.Stream;

public class Main03 {
    public static void main(String[] args) {
        // проверить будут ли все строки в коллеккции больше 3-х симвовлов в длину
        String[] strings = {
                "apple", "orange", "pineapple",
                "apple", "cucumber", "lemon", "lemon",
                "tomato", "corn", "cabbage", "banana",
                "lime", "lemon"
        };

        boolean result = Stream.of(strings) //источник
                .peek(s -> System.out.println(s)) // промежуточная операция для отладки
                .allMatch(s -> s.length() >3); //терминальная операция

        System.out.println("Все строки длинее 3-х символов: " + result);
    }
}