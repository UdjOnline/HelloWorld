package l43_java_IO.wclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// FileInputStream используется для чтения данных из файла.
// Scanner - полезная обертка для работы с потоками ввода
public class ReadByScanner {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("resources/file")
        ) {
            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()) {
                // читаем построчно пока есть данные
                String line = scanner.nextLine();
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}