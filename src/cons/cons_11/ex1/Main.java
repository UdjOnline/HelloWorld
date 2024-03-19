package cons.cons_11.ex1;

public class Main {
    public static void main(String[] args) {
        Position p = new Position(4,5);
        System.out.println(p);
        p.move(6, Directions.LEFT);
        System.out.println(p);
    }
}
