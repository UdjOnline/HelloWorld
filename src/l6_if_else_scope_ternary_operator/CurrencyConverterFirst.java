package l6_if_else_scope_ternary_operator;

import java.util.Scanner;

public class CurrencyConverterFirst {
    public static void main(String[] args) {
        System.out.println("Приветствуем в Currency Converter!\n");
        Scanner scanner = new Scanner(System.in); // создаем сканер
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine(); // считываем введенное значение
        System.out.println("Привет, " + name + "!"); // выводим это сообщение
        System.out.print(
                "Выберите исходную валюту:\n" +
                "1. EURO\n" +
                "2. USD\n" +
                "3. TL\n"
        );
        System.out.print("Введите номер валюты: ");
        int currencyFrom = scanner.nextInt();
        if (currencyFrom == 1) {
            System.out.println("\n Перевести ЕВРО");
        } else if (currencyFrom == 2) {
            System.out.println("\n Перевести доллары США");
        } else if (currencyFrom == 3) {
            System.out.println("\n Перевести турецкие лиры");
        } else {
            System.out.println("Вы ввели неверный номер валюты!");
            System.exit(-1);
        }
        System.out.print(
                "В какую валюту перевести?\n\n" +
                        "1. EURO\n" +
                        "2. USD\n" +
                        "3. TL\n\n"
        );
        System.out.print("Введите номер валюты: ");
        int currencyIn = scanner.nextInt();
        if (currencyIn == 1) {
            System.out.println("\nв Евро\n");
        } else if (currencyIn == 2) {
            System.out.println("\nв доллары США\n");
        } else if (currencyIn == 3) {
            System.out.println("\nв турецкие лиры\n");
        } else {
            System.out.println("\nВы ввели неверный номер валюты.\n");
            System.exit(-1);
        }
        System.out.print("Введите сумму перевода: ");
        double sum = scanner.nextDouble();
        double x;
        double y;
        if (currencyFrom == 1) {
            x = 1.0;  // курс euro относительно euro
        } else if (currencyFrom == 2) {
            x = 0.92;  // курс usd относительно euro
        } else {
            x = 0.03;  // курс tl относительно euro
        }
        if (currencyIn == 1) {
            y = 1.0;  // курс euro относительно euro
        } else if (currencyIn == 2) {
            y = 0.92;  // курс usd относительно euro
        } else {
            y = 0.03;  // курс tl относительно euro
        }
        double total = sum * x / y;
        System.out.print("\nВы получите: ");
        System.out.println(total);
        System.out.println("Досвидание, " + name + "!");
    }
}