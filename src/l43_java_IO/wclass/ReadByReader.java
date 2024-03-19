package l43_java_IO.wclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// BufferedReader используется для буферизированного чтения
// текста из файла. Метод readLine() читает текст построчно
// до тех пор, пока не встретит null, что означает конец файла.
public class ReadByReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("resources/example2.txt")) {
            BufferedReader br = new BufferedReader(fr);

            do {
                // Чтение построчно
                String line = br.readLine();
                if (line == null) // когда кончились данные
                    break;
                // Вывод прочитанных данных на экран
                System.out.println(line);
            } while (true);
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода");
        }
    }
}