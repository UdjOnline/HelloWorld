package cons.cons_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int[] arr = {4,8,-5,1,3,-1,654,-21,324,-16,564,65,-165,16,51,-65};

        long size = Arrays.stream(arr)
                .filter(i -> i < 0) // выбрасываем из потока элементы меньше нуля
                .count(); //совершаем операцию count
        System.out.println("Количество элементов в массиве: " + size);

        size = Arrays.stream(arr)
                .filter(i -> i % 2 == 0) //фильтруем четные числа
                .count();
        System.out.println("Количество чётных элементов в массиве: " + size);
    }
}