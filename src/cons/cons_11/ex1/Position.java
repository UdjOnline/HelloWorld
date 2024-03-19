package cons.cons_11.ex1;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int distance, Directions direction) {
        switch (direction) {
            case UP:
                y += distance;
                break;
            case DOWN:
                y -= distance;
                break;
            case RIGHT:
                y += distance;
                break;
            case LEFT:
                x -= distance;
                break;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}