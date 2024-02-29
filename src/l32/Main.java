package l32;

import java.util.Scanner;

enum MoonPhases {
    NEW_MOON ("Новолуние \uD83C\uDF11"),
    MAXING_CRESCENT("Растущий серп \uD83C\uDF12"),
    FIRST_QUARTER("Первая четверть \uD83C\uDF13"),
    WAXING_GIBBOUS("Растущая Луна \uD83C\uDF14"),
    FULL_MOON("Полнолуние \uD83C\uDF15"),
    WANING_GIBBOUS("Убывающая Луна \uD83C\uDF16"),
    LAST_QUARTER("Последняя четверть \uD83C\uDF17"),
    WANING_CRESCENT("Убывающий серп \uD83C\uDF18");

    private final String description;

    MoonPhases(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
public class Main {
    public static void main(String[] args) {
        for (MoonPhases moonPhases : MoonPhases.values()) {
            System.out.println(moonPhases + ": " + moonPhases.getDescription());
        }

        System.out.print("Выберите фазу луны: ");
        Scanner scanner = new Scanner(System.in);
        String moonPhaseName = scanner.nextLine();

        MoonPhases moonPhases = MoonPhases.valueOf(moonPhaseName);

        switch (moonPhases) {
            case NEW_MOON:
                System.out.println("Вау, ее совсем не видно, это новолуние! Фаза: " + moonPhases);
                break;
            case FIRST_QUARTER:
                System.out.println("Вау, первая четверть! Фаза: " + moonPhases);
                break;
            case WANING_CRESCENT:
                System.out.println("Вау, это убывающий серп! Фаза:  " + moonPhases);
                break;
            default:
                System.out.println("Это очень красиво! Фаза: " + moonPhases);
        }
    }
}

/*
Новолуние (New Moon) ... "\uD83C\uDF11"
Растущий серп (Waxing Crescent) ... "\uD83C\uDF12"
Первая четверть (First Quarter) ... "\uD83C\uDF13"
Растущая Луна (Waxing Gibbous) ... "\uD83C\uDF14"
Полнолуние (Full Moon) ... "\uD83C\uDF15"
Убывающая Луна (Waning Gibbous) ... "\uD83C\uDF16"
Последняя четверть (Last Quarter) ... "\uD83C\uDF17"
Убывающий серп (Waning Crescent) ... Convert to Basic Latin
*/