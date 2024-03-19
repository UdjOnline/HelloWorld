package l11_metod2;

import java.util.Scanner;

public class CurrencyConverterSwitch1 {
    public static void main(String[] args) {
        System.out.println("Приветствуем в Currency Converter!\n");
        Scanner scanner = new Scanner(System.in); // создаем сканер
        String currencyFrom;
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine(); // считываем введенное значение
        System.out.println("Привет, " + name + "!"); // выводим это сообщение
        do {
            System.out.print(
                    "Выберите исходную валюту:\n" +
                            "EURO\n" +
                            "USD\n" +
                            "TL\n" +
                            "или введите exit, чтобы завершить программу\n"
            );
            System.out.print("Выберите исходную валюту: ");
            currencyFrom = scanner.nextLine();
            switch (currencyFrom) {
                case "EURO":
                    System.out.println("Перевести Евро");
                    break;
                case "USD":
                    System.out.println("Перевести доллары США");
                    break;
                case "TL":
                    System.out.println("Перевести турецкие лиры");
                    break;
                case "exit":
                    continue;
                default:
                    continue;
            }

        /* if (currencyFrom == 1) {
            System.out.println("\n Перевести ЕВРО");
        } else if (currencyFrom == 2) {
            System.out.println("\n Перевести доллары США");
        } else if (currencyFrom == 3) {
            System.out.println("\n Перевести турецкие лиры");
        } else {
            System.out.println("Вы ввели неверный номер валюты!");
            System.exit(-1);
        }*/
            System.out.print(
                    "В какую валюту перевести?\n\n" +
                            "EURO\n" +
                            "USD\n" +
                            "TL\n\n"
            );
            System.out.print("Выберите конечную валюту: ");
            String currencyTo = scanner.nextLine();
            switch (currencyTo) {
                case "EURO":
                    System.out.println("перевести в Евро");
                    break;
                case "USD":
                    System.out.println("перевести в доллары США");
                    break;
                case "TL":
                    System.out.println("перевести в турецкие лиры");
                    break;
                default:
                    continue;
            }

            /*if (currencyIn == 1) {
            System.out.println("\nв Евро\n");
        } else if (currencyIn == 2) {
            System.out.println("\nв доллары США\n");
        } else if (currencyIn == 3) {
            System.out.println("\nв турецкие лиры\n");
        } else {
            System.out.println("\nВы ввели неверный номер валюты.\n");
            System.exit(-1);
        }*/

            System.out.print("Введите сумму перевода: ");
            double sum = scanner.nextDouble();
            double x;
            double y;
            if (currencyFrom.equals("EURO")) {
                x = 1.0;  // курс euro относительно euro
            } else if (currencyFrom.equals("USD")) {
                x = 0.92;  // курс usd относительно euro
            } else {
                x = 0.03;  // курс tl относительно euro
            }
            if (currencyTo.equals("EURO")) {
                y = 1.0;  // курс euro относительно euro
            } else if (currencyTo.equals("USD")) {
                y = 0.92;  // курс usd относительно euro
            } else {
                y = 0.03;  // курс tl относительно euro
            }
            double total = sum * x / y;
            System.out.print("\nВы получите: ");
            System.out.println(total);
            //System.out.println("Досвидание, " + name + "!");
        } while (!currencyFrom.equals("exit"));
    }
}