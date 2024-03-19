package cons.cons_12;

import java.util.List;

public class Main04 {
    // посчитать общее количество букв во всех строках

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "How are you", "Goodbye");
        int lettersAmount = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Количество букв: " + lettersAmount);

        lettersAmount = list.stream()
                .map(String::length)
                .reduce(0, Integer::sum); // похожий метод

        System.out.println("Количество букв: " + lettersAmount);
    }
}