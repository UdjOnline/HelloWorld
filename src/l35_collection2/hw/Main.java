package l35_collection2.hw;

import java.util.*;

class Bobr implements Comparable<Bobr> {
    String name;
    int age;
    int relativesCount;

    public Bobr (String name, int age, int relativesCount) {
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }

    public int getRelativesCount() {
        return relativesCount;
    }

    @Override
    public int compareTo(Bobr anotherBobr) {
        return this.age - anotherBobr.age;
    }

    @Override
    public String toString() {
        return name + ": " + "возраст-" + age + ", " + "родственники-" + relativesCount;
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
        //return b1.compareTo(b2);
        return Integer.compare((b1.getRelativesCount()), b2.getRelativesCount());
    }
}
public class Main {
    public static void main(String[] args) {
        List<Bobr> bobrList = new ArrayList<>();

        bobrList.add(new Bobr("Snejinka", 7, 20));
        bobrList.add(new Bobr("NorbertFoster", 5, 80));
        bobrList.add(new Bobr("DeggetDufus", 3, 40));


        Collections.sort(bobrList);
        System.out.println("Отсортировано: " + bobrList);

        Collections.sort(bobrList, new NameComparator());
        System.out.println("Отсортировано по имени с помощью компаратора: " + bobrList);

        Collections.sort(bobrList, new RelativesCountComparator());
        System.out.println("Отсортировано по родственникам с помощью компаратора: " + bobrList);

        Collections.sort(bobrList, (b1, b2) -> b1.name.compareTo(b2.name));
        System.out.println("Отсортированно по имени через Лямбда Выражения : " + bobrList);

        Map<String, Integer> map = new HashMap<>(); // сохдали HashMap
        // поместили в него пары ключ-значение
        map.put("DeggetDufus", 40);
        map.put("Snejinka", 20);
        map.put("NorbertFoster", 80);
        System.out.println("MAP: " + map);

        // итерация по ключам
        for (String key : map.keySet()) {
            System.out.println(key + map.get(key));
        }
    }
}