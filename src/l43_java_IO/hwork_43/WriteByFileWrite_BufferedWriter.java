package l43_java_IO.hwork_43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* BufferedWriter используется для буферизированной записи текста в файл.*/
public class WriteByFileWrite_BufferedWriter {
    public static void main(String[] args) {
        writeByFW_BW("Hello, world! I'm here. Eugeny.", "resources/homeWork_43.txt");
    }
    public static void writeByFW_BW (String data, String filePath) {
        try (FileWriter fw = new FileWriter(filePath)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data); // Записываем строку в файл
            bw.write("\nGood-bye, world!\nSee you next time!"); //записываем дополнительые строки
            bw.flush();
            System.out.println("All information added to the file!");
        } catch (IOException e) {
            System.err.print("Error input/output");
        }
    }
}