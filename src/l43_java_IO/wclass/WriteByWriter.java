package l43_java_IO.wclass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// BufferedWriter используется для буферизированной записи
// текста в файл. Метод write() используется для записи
// текста, а newLine() для добавления новой строки.
public class WriteByWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("resources/example2.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, world!"); // Записываем строку в файл
            bw.newLine(); // Добавляем новую строку
            bw.write("Good-bye world!\nSee you next time!");
            bw.flush();
            System.out.println("Information added to the file!");
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}