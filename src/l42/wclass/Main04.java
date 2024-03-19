package l42.wclass;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main04 {
    public static void main(String[] args) {
        // получитьь пять максимальных значений из массива чисел
        int[] data = {5,3,4,6,55,4,7,56,53,4,4,4};
        IntStream.of(data) //источник, выложили числа на конвеер
                .sorted() // промежуточная операция, прошла сортировка
                .skip(data.length - 5) // промежуточная операция, пропустили первые операции, оставили последние 5.
                .forEach(i -> System.out.println(i)); // терминальная операция


        // или так
//        int[] result = IntStream.of(data) //источник
//                .sorted() // промежуточная операция
//                .skip(data.length - 5) // промежуточная операция
//                .toArray();
//        System.out.println(Arrays.toString(result));
    }
}