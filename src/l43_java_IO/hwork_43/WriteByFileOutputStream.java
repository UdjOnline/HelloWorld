package l43_java_IO.hwork_43;

import java.io.FileOutputStream;
import java.io.IOException;

/* FileOutputStream используется для записи байтов в файл.*/
public class WriteByFileOutputStream {
    public static void main(String[] args) {
        writeByFOS ("Hello, world! I'm here. Eugeny.", "resources/homeWork_43.txt");
    }

    public static void writeByFOS(String data, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // преобразуем строку в массив байтов
            byte[] textBytes = data.getBytes();
            // записываем байты в файл
            fos.write(textBytes);
            fos.flush();
            System.out.println("All information added to the file!");
        } catch (IOException e) {
            System.err.println("Error input/output");
        }
    }
}