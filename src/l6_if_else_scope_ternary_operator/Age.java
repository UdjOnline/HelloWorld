package l6_if_else_scope_ternary_operator;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш год рождения:");
        int x = scanner.nextInt();
        int Age = 2024 - x;
        if (Age <= 0 | Age > 150){
            System.out.println("Некоректный аргумент");
            System.exit(-1);
        } else if (Age > 0 && Age <= 14){
            System.out.println("Вы: Ребенок");
        } else if (Age > 14 && Age <= 18){
            System.out.println("Вы: Подросток");
        }
        /*else if (l6.Age>18 && l6.Age<=60){
            System.out.println("Вы: Взрослый");
        }else if (l6.Age>60){
            System.out.println("Вы: Пожилой");
        }*/
        else {
            String s = (Age > 60) ? "Пожилой" : "Взрослый";
            System.out.println(s);
        }
        System.out.println("До новых встреч!");
    }
}