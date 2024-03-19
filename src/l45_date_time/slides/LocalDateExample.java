package l45_date_time.slides;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // вернет объект сегодняшней даты
        System.out.println("Сегодняшняя дата: " + today);

        LocalDate specificDate = LocalDate.of(2024, 3, 16);
        System.out.println();
    }
}