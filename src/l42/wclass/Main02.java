package l42.wclass;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main02 {
    public static void main(String[] args) {
        // првратить массив чисел в строку разделеннуюю запятыми

        String result = IntStream.range(0, 42) // источник, последний элем-42 не будет включён
                .mapToObj(i -> String.valueOf(i)) // промежуточная операция
                .collect(Collectors.joining(",")); // терминальная операция
        System.out.println(result);
    }
}