package l43_java_IO.wclass;

import java.io.IOException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        try {
            byte[] bytes = System.in.readNBytes(8);
        } catch (IOException e) {
            System.out.println("ошибка");
        }
        //Scanner scanner = new Scanner(System.in);
    }
}