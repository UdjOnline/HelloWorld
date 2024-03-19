package cons.cons_10.ex4;

/* создать класс Printer, который печатает переменные какого-то типа
    и сохраняет последнее напечаттное значение (как ссылку) */
class Printer<T> {
    private T lastPrinted;

    public void print (T obj) {
        System.out.println (obj.toString());
        lastPrinted = obj;
    }
    public T getLastPrinted() {
        return lastPrinted;
    }
}

public class Main {
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>();
        stringPrinter.print("Hello");
        stringPrinter.print(" world!");

        System.out.println("Last printed: " + stringPrinter.getLastPrinted());

        Printer<Double> numberPrinter = new Printer<>();
        numberPrinter.print(45.5);
        numberPrinter.print(-456.0);
        numberPrinter.print(17.0);

        System.out.println("Last printed: " + numberPrinter.getLastPrinted());
    }
}