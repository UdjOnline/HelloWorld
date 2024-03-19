package cons.cons_13;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main01 {
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        System.out.println("Hello");

        try {
            file.createNewFile();
        } catch (IOException e) { // ловим проверяемое исключение
            System.out.println("Error: " + e.getMessage());
        } catch (SecurityException e) { // ловим непроверяемое исключение
            System.out.println("Security error! " + e.getMessage());
        }
        //throw new IOException()
   }
}