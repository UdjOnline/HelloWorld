package l43_java_IO.hwork_43;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Reader {
    public static void main(String[] args) {
        // записываем(либо создаем файл, указываем параметр append, чтобы файл перезаписывался.
        try(FileWriter wr = new FileWriter("resources/homeWork_43.txt", false)) {

            wr.write("Hello, world! I'm here. Eugeny"); // запись всей строки
            wr.append('.'); // запись по символам
            wr.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Information added to the file!\n" +
                "_______________________________");

        try(FileReader r = new FileReader("resources/homeWork_43.txt")) {
            int c;
            while(( c =r.read()) !=-1) { // читаем посимвольно
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nInformation readed!");
    }
}