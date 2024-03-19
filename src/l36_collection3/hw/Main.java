package l36_collection3.hw;

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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bobr bobr = (Bobr) o;
        if (age != bobr.age) return false;
        if (relativesCount != bobr.relativesCount) return false;
        if (!name.equals(bobr.name)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + relativesCount;
        return result;
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

        bobrList.add(new Bobr("Snejinka", 7, 5));
        bobrList.add(new Bobr("NorbertFoster", 5, 8));
        bobrList.add(new Bobr("DeggetDufus", 3, 6));
        bobrList.add(new Bobr("Funtik", 6, 7));
        bobrList.add(new Bobr("Shaman", 10, 9));

        Collections.sort(bobrList);
        System.out.println("Отсортировано: \n" + bobrList);

        Collections.sort(bobrList, new NameComparator());
        System.out.println("Отсортировано по имени с помощью компаратора: \n" + bobrList);

        Collections.sort(bobrList, new RelativesCountComparator());
        System.out.println("Отсортировано по родственникам с помощью компаратора: \n" + bobrList);

        Collections.sort(bobrList, (b1, b2) -> b1.name.compareTo(b2.name));
        System.out.println("Отсортированно по имени через Лямбда Выражения : \n" + bobrList);

        Map<String, Integer> map = new HashMap<>(); // создали HashMap
        // поместили в него пары ключ-значение
        map.put("DeggetDufus", 40);
        map.put("Snejinka", 20);
        map.put("NorbertFoster", 80);
        //for Bobr bobr: list) {
        //map.put(bobr.name, bobr.relativesCount);
        // }
        System.out.println(map.containsKey("Sytjinka") + ", " + map.containsValue(1) + ", " + map.keySet() + ", " + map.values() + ".");

        System.out.println("----------------------------------------------------");
        System.out.println("MAP: " + map);
        System.out.println("----------------------------------------------------");

        // итерация по ключам
        for (String key : map.keySet()) {
            System.out.println(key + map.get(key));
        }

        Set<String> bobrSet = new HashSet<>();
        //for (Bobr bobr : list) {
            //map.put(bobr.name, bobr.relativesCount);
        //}
        //bobrSet.add("Snejinka");
        //System.out.println(bobrSet);}

        //добавляем бобров в мешок Set
        bobrSet.add("DeggetDufus");
        bobrSet.add("Snejinka");
        bobrSet.add("Shaman");

        System.out.println("------------------------------------------------");
        System.out.print("В мешке HashSet: " + bobrSet);  // вывод в консоль
        System.out.println("------------------------------------------------");

        // проверка наличия бобра в мешке Set
        for (String name : bobrSet) {
            System.out.println(name);
        }
        System.out.println("------------------------------------------------");

        // Перебор элементов с использованием улучшенного цикла for
        for (String bobr : bobrSet) {
            System.out.println("В мешке Set: " + bobr);
        }
        System.out.println("------------------------------------------------");

        // Проверка наличия бобра в мешке:
        if (bobrSet.contains("DeggetDufus")) {
            System.out.println("DeggetDufus is in the Sett");
        }
    }
}