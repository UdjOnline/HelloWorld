package l43_java_IO.wclass;

import java.io.FileInputStream;
import java.io.IOException;

/* FileInputStream используется для чтения данных из файла.
Метод read() возвращает следующий байт данных или -1,
если достигнут конец файла
 */
public class ReadWithTryByStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("resources/example2.txt")) {
            do {
                //чтение по одному байту за итерацию
              int i = fis.read();
              if (i == -1) //когда кончились данные, то
                  break;
              // вывод прочитанных данных на экран
                System.out.print((char) i);

            } while (true);
        }catch (IOException e) {
            System.out.println("Ощибка ввода/вывода)");
        }
    }
}