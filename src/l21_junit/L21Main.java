package l21_junit;

public class L21Main {
    public static void main(String[] args) {
        Car bmw = new Car ("bmw", 1915);
        Car vw = new Car ("vw", 1915);
        Car citroen = new Car ("citroen", 1915);

        CarArrayList garage = new CarArrayList();

        garage.add(citroen);
        garage.add(bmw);
        garage.add(vw);

        System.out.println(garage);
        // машины те, которые мы указали
        // машины в том же порядке, в котором мы указали
        // свойства машин такие же как мы указали
    }
}