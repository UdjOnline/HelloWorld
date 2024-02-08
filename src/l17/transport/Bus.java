package l17.transport;

public class Bus {
    String brendBus; String typeBus; String colorBus; int priceBus;
    public Bus(String brendBus, String typeBus, String colorBus, int priceBus) {
        this.brendBus = brendBus;
        this.typeBus = typeBus;
        this.colorBus = colorBus;
        this.priceBus = priceBus;
    }
    public String toString() {
        return "Bus: " + brendBus + ", " + typeBus + ", " + colorBus + ", " + priceBus + " USD.";
    }
}
