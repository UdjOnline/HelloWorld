package l27_interface;

public interface Drawable {
    void draw(); // создаём метод draw

    double getArea();

    double getPerimeter();
}
interface Fillable {
    void fill();
}

abstract class Shape implements Drawable, Fillable {
    protected String color;
    protected String name;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void printInfo() {
        System.out.println("Фигура: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}
    class Circle extends Shape {
        private double radius;

        public Circle(String name, String color, double radius) {
            super(name, color);
            this.radius = radius;
        }

        @Override
        public void draw() {
            System.out.println("Рисуем круг.");
        }

        @Override
        public void fill() {
            System.out.println("Закрашиваем круг в цвет: " + color);
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    class Cube extends Shape {
        private double lengthRib;

        public Cube(String name, String color, double lengthRib) {
            super(name, color);
            this.lengthRib = lengthRib;
        }

        @Override
        public void draw() {
            System.out.println("Рисуем куб.");
        }

        @Override
        public void fill() {
            System.out.println("Закрашиваем куб.");
        }

        @Override
        public double getArea() {
            return 6 * lengthRib * lengthRib;
        }

        @Override
        public double getPerimeter() {
            return 12 * lengthRib;
        }
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(String name, String color, double length, double width) {
            super(name, color);
            this.length = length;
            this.width = width;
        }

        @Override
        public void draw() {
            System.out.println("Рисуем прямоугольник.");
        }

        @Override
        public void fill() {
            System.out.println("Закрашиваем прямоугольник.");
        }

        @Override
        public double getArea() {
            return length * width;
        }

        @Override
        public double getPerimeter() {
            return 2 * length + 2 * width;
        }
    }

    class Square extends Shape {
        private double side;

        public Square(String name, String color, double side) {
            super(name, color);
            this.side = side;
        }

        @Override
        public void draw() {
            System.out.println("Рисуем квадрат.");
        }

        @Override
        public void fill() {
            System.out.println("Закрашиваем квадрат.");
        }

        @Override
        public double getArea() {
            return side * side;
        }

        @Override
        public double getPerimeter() {
            return 4 * side;
        }
    }

    class Triangle extends Shape {
        double basis;
        double height;
        double sideA;
        double sideB;

        public Triangle(String name, String color, double basis, double height, double sideA, double sideB) {
            super(name, color);
            this.basis = basis;
            this.height = height;
            this.sideA = sideA;
            this.sideB = sideB;
        }

        @Override
        public void draw() {
            System.out.println("Рисуем треугольник.");
        }

        @Override
        public void fill() {
            System.out.println("Закрашиваем треугольник в цвет: " + color);
        }

        @Override
        public double getArea() {
            return 0.5 * basis * height;
        }

        @Override
        public double getPerimeter() {
            return basis + sideA + sideB;
        }
    }

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle", "yellow", 7),
                new Square("Square", "red", 3),
                new Triangle("Triangle", "black", 5, 7, 8, 9),
                new Cube("Cube", "white", 10),
                new Rectangle("Rectangle", "blue", 11, 15)
        };

        for (Shape shape : shapes) {
            shape.draw();
            shape.printInfo();
            shape.fill();

            System.out.println();
        }
    }
}