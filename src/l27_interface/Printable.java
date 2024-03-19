package l27_interface;

public interface Printable {
    void print();

    class Photo implements Printable {
        @Override
        public void print() {
            System.out.println("Print photo");
        }
    }

    class Ticket implements Printable {
        @Override
        public void print() {
            System.out.println("Print ticket");
        }
    }

class Main {
    public static void main(String[] args) {
            Printable ticket = new Ticket();
            System.out.println("Печатаю чек");
            ticket.print();
            Printable photo = new Photo();
            photo.print();
        }
    }
}