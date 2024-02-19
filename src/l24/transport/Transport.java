package l24.transport;

import l24.people.People;

public class Transport {
    protected String type; protected String color; protected int productionYear;

    public Transport (String type, String color, int productionYear) {
        this.type = type;
        this.color = color;
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Transport transport = (Transport) obj;
        return productionYear == transport.productionYear && (type == null ? transport.type == null : type.equals(transport.type));
    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + productionYear;
        return result;
    }

    public String toString() {
        return type + ", " + color + productionYear + "." ;
    }
}