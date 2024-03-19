package l42.wclass;

public class Main05 {
    public static boolean isInt(String str) {
        // try-catch блоку
        // NumberFormatException
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        // вернуть true если строчка сверху работает без ошибок
        // иначе вернуть false
    }
    public static void main(String[] args) {
        System.out.println(isInt("qwerty"));
        System.out.println(isInt("1234"));
        System.out.println(isInt("1234-1212"));
    }
}