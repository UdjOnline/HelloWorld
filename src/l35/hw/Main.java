package l35.hw;

import java.util.*;

class Bobr implements Comparable<Bobr> {
    String name;
    int age;
    int relativesCount;

    Bobr(String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    @Override
    public int compareTo(Bobr anotherBobr) {
        return this.age - anotherBobr.age;
    }

    @Override
    public String toString() {
        return name + ": " + age + ", " + relativesCount;
    }
}

class NameComparator implements Comparator<Bobr> {
    @Override
    public int compare (Bobr b1, Bobr b2) {
        return b1.name.compareTo(b2.name);
    }
}

class RelativesCountComparator implements Comparator<Bobr> {
    @Override
    public int compare(Bobr b1, Bobr b2) {
        return b1.compareTo(b2);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Bobr> bobrList = new ArrayList<>();

        bobrList.add(new Bobr("Snejinka", 7, 2));
        bobrList.add(new Bobr("Norbert_Foster", 5, 8));
        bobrList.add(new Bobr("Degget_Dufus", 3, 4));


        Collections.sort(bobrList);
        System.out.println("Добавлено: " + bobrList);

        Collections.sort(bobrList , new NameComparator());
        System.out.println("Отсортировано по имени: " + bobrList);

        Collections.sort(bobrList, new RelativesCountComparator());
        System.out.println("Отсортировано по родственникам: " + bobrList);

        Collections.sort(bobrList,(b1, b2) -> b1.name.compareTo(b2.name));
        System.out.println("Отсортированно по имени через ЛВ: " + bobrList);

        Map<String, Integer> map = new HashMap<>();
        map.put("Degget_Dufus", 4);
        map.put("Snejinka", 2);
        map.put("Norbert_Foster", 8);

        System.out.println("MAP: " + map);
    }
}
