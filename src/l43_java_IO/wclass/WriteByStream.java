package l43_java_IO.wclass;

import java.io.FileOutputStream;
import java.io.IOException;

/* FileOutputStream используется для записи байтов в файл.
мы преобразуем строку в массив байтов и записываем его
в файл с помошбюю меттода write()
*/
public class WriteByStream {
    public static void main(String[] args) {
        writeTo ("Hello, world!", "resources/file3.txt");
    }

    public static void writeTo(String data, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // преобразуем строку в массив байтов
            byte[] textBytes = data.getBytes();
            // записываем байты в файл
            fos.write(textBytes);
            fos.flush();
        } catch (IOException e) {
            System.out.println("ошибка ввода/вывода");
        }
    }
// либо:
//    /*public static void main(String[] args) {
//        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
//            String text = "Привет, мир!";
//            // Преобразуем строку в массив байтов
//            byte[] textBytes = text.getBytes();
//            // Записываем байты в файл
//            fos.write(textBytes);
//        } catch (IOException e) {
//            System.out.print("Ошибка ввода вывода");
//        }
//    }*/
}