package l43_java_IO.hwork_43;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader используется для буферизированного чтения текста из файла.
public class ReadByReader_BufferedReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("resources/homeWork_43.txt")) {
            BufferedReader br = new BufferedReader(fr);

            do {
                // Чтение построчно
                String line = br.readLine();
                if (line == null) // когда кончились данные
                    break;
                // Вывод прочитанных данных на экран
                System.out.println("Information read from file: " + line);
            } while (true);
        } catch (IOException e) {
            System.err.print("Error input/output");
        }
    }
}