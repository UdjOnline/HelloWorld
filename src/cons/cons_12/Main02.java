package cons.cons_12;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main02 {
    public static void main(String[] args) {
        Runnable helloFunction = () -> {System.out.println("Hello!");};

        Supplier<String> helloSupplier = () -> "Hello";
        Runnable helloFunction1 = () -> {System.out.println(helloSupplier.get());};

        helloFunction.run(); // запускаем методы
        helloFunction1.run();

        Consumer<String> printer = (s) -> System.out.println(s);
        // то же самое
        Consumer<String> printer1 = System.out::println;
        printer.accept(helloSupplier.get());
    }
}