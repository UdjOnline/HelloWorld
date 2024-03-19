package l8_array_for;

import java.util.Scanner;

public class CurrencyConverterFor {
    public static void main(String[] args) {
        String[] availableCurrencies = {"EURO", "USD", "TL"}; // явная инициализация массива валюты
        double[] currencyRates = {1, 0.92, 0.03}; //явная инициализация массива курса

        if (args.length == 3) { /*создаем оператор if и указываем аргумент)*/
            currencyRates[0] = Double.parseDouble(args[0]);
            currencyRates[1] = Double.parseDouble(args[1]);
            currencyRates[2] = Double.parseDouble(args[2]);
        }

        Scanner scanner = new Scanner(System.in); // создаем сканер для считывания данных пользователя
        String currencyFrom, currencyTo, name; //обьявляем переменные

        System.out.print(
                "Приветствуем в Currency Converter!\n" +
                "Введите Ваше имя: \n"
        );
        name = scanner.nextLine(); // считываем введенное значение имени
        System.out.print(
                "Привет, " + name + "!\n" +
                "Выберите исхрдную валюту: \n"
        ); // выводим это сообщение пользователю

        for (String availableCurrency: availableCurrencies) //использование итеративного оператора for
            System.out.println("* " + availableCurrency + " *"); //выводим пользователю
        System.out.println("или введите exit, чтобы завершить программу"); //выводим пользователю

        do {
        /*{System.out.print(
                    "Выберите исходную валюту:\n" +
                            "EURO\n" +
                            "USD\n" +
                            "TL\n" +
                            "или введите exit, чтобы завершить программу\n"
            );*/ // не используем
            System.out.print("Выберите исходную валюту: ");
            currencyFrom = scanner.nextLine(); //считываем исходное значение валюты
            double x, y;//обьявляем переменные и используем свитч
            switch (currencyFrom) {
                case "EURO":
                    /*System.out.println("Перевести Евро");*/ //не используем
                    x = currencyRates[0];
                    break;
                case "USD":
                    /*System.out.println("Перевести доллары США");*/
                    x = currencyRates[1];
                    break;
                case "TL":
                    /*System.out.println("Перевести турецкие лиры");*/
                    x = currencyRates[2];
                    break;
                case "exit":
                    System.out.println("До новых встреч!");
                    continue;
                default:
                    System.out.println("Вы ввели неверное значение, попробуйте еще раз!");
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
            System.out.print("Выберите в какую валюту перевести: ");
            currencyTo = scanner.nextLine(); //запускаем сканер введенной валюты
            switch (currencyTo) {
                case "EURO":
                    /*System.out.println("перевести в Евро");*/ //не используем
                    y = currencyRates[0];
                    break;
                case "USD":
                    /*System.out.println("перевести в доллары США");*/ //не используем
                    y = currencyRates[1];
                    break;
                case "TL":
                    /*System.out.println("перевести в турецкие лиры");*/ //неиспользуем
                    y = currencyRates[2];
                    break;
                default:
                    System.out.println("Вы ввели неверное значение, попробуйте еще раз!");
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

            System.out.print("Введите сумму перевода в исходной валюте: ");
            double initSum = Double.parseDouble(scanner.nextLine()); //запускаем сканер
            /*double x;*/
            /*double y;*/
            /*if (currencyFrom.equals("EURO")) {
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
            }*/

            double finalSum = initSum * x / y; //считаем сумму перевода
            //округляем вниз до 2-х знаков
            int roundedTotal = (int) (finalSum * 100);
            finalSum = (double) roundedTotal / 100;

            System.out.println("Вы получите: " + finalSum);
            System.out.println("Досвидание, " + name + "!");
        } while (!currencyFrom.equals("exit")); //заново запускаем
    }
}