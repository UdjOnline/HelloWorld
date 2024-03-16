package l43_java_IO.hwork_43;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// FileInputStream используется для чтения данных из файла.
public class ReadByScanner {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("resources/homeWork_43.txt")
        ) {
            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()) {
                // читаем построчно пока есть данные
                String line = scanner.nextLine();
                System.out.print("Information read from file: " + line);
            }
        } catch (IOException e) {
            System.err.print("Error input/output!");
        }
    }
}