package l43_java_IO.hwork_43;

import java.io.FileInputStream;
import java.io.IOException;

/* FileInputStream используется для чтения данных из файла.*/
public class ReadWithFileInputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("resources/homeWork_43.txt")) {
            do {
                //чтение по одному байту за итерацию
                int i = fis.read();
                if (i == -1) //когда кончились данные, то
                    break;
                // вывод прочитанных данных на экран
                System.out.print((char) i);

            } while (true);
           System.out.println(" - Information read from file!");
        }catch (IOException e) {
            System.err.println("Error input/output");
        }
    }
}