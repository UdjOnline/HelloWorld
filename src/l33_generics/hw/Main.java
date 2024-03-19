package l33_generics.hw;

class Box<T> { //объявляем класс Box с типом-параметром T.
    private T content; // поле content типа T.

    public void set(T content) { //метод для установки значения поля content.
        this.content = content;
    }

    public T get() { //метод для получения значения поля content.
        return content;
    }

    static <T> boolean isEqual(Box<T> box, Box<T> box1) { //обобщённый метод isEqual с типом-параметром T
        return box.get().equals(box1.get()); //сравнение содержимого двух box объектов
    }
}

class Main {
    //static boolean checkBox(Box<String> stringBox) {
    //   return stringBox.get() != null;
    //}
    public static void main(String[] args) {
        Box<String> stringBox = new Box<String>(); //создание экземпляра обобщённого класса Box для String.
        Box<String> stringBox1 = new Box<>();
        Box<String> stringBox2 = new Box<>();
        stringBox.set("Hello Generics"); //установка значения
        stringBox1.set("Hello Generics Box1");
        stringBox2.set("Hello Generics");
        System.out.println(stringBox.get()); //вывод значения
        System.out.println(stringBox1.get());
        System.out.println(stringBox2.get());

        //boolean checked = checkBox(new Box<String>());
        //System.out.println(checked);


        boolean isEqual = Box.<String>isEqual(stringBox, stringBox1);
        System.out.println(isEqual);
        boolean isEqual1 = Box.<String>isEqual(stringBox, stringBox2);
        System.out.println(isEqual1);

        Box<Integer> box = new Box<Integer>(); //создание экземпляра обобщённого класса Box для Int.
        box.set(10);
        System.out.println(box.get());
        Box<Integer> box1 = new Box<>();
        box1.set(10);
        System.out.println(box1.get());


        boolean isEqual2= Box.<Integer>isEqual(box, box1);
        System.out.println(isEqual2);
    }
}