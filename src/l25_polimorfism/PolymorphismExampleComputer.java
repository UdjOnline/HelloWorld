package l25_polimorfism;

class Computer {
    void enable() {
        System.out.println("Computer is enabled");
    }
}

class ComputerWithoutProtection extends Computer {
    void removeHDD() {
        System.out.println("HDD is removed");
    }

    void insertHDD() {
        System.out.println("dd is inserted");
    }

    // взрываем компьютер по кнопке
    void blowUp() {
        System.out.println("Computer is blown Up");
    }
}

public class PolymorphismExampleComputer {
    public static void main(String[] args) {
        ComputerWithoutProtection computerWithoutProtection = new ComputerWithoutProtection();
        // компьютер надо показать бабушке чтобы она его включила и не взорвала
        // закрываем крышку компьютера
        //Computer computer = ComputerWithoutProtection;
        //System.out.println("пришла бабушка");
        //System.out.println("показываем бабушке компьютер и просим включить, ее действия:");
        //computer.enable();
    }
}