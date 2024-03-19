package l5_boolean_logical_operations;

import java.util.Scanner;
import static java.lang.Math.*;

public class CosX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("cos(X), X: ");
        double x = scanner.nextDouble();
        double cosX = cos(x);
        System.out.println("Result: " + cosX);
    }
}