package l17;
import l17.transport.Car;
import java.util.Arrays;

public class CarArrayList {
    static int INITIAL_SIZE = 10; // начальный размер массива
    Car [] cars; //создаём массив Car для хранения элоемеетов (машин), внутренний массив
    int count = 0; //количесиво элементов списка
    String element;
    int index;

    public CarArrayList(){
        this.cars = new Car[INITIAL_SIZE];
    }

    public void add(Car element){
        if (this.count >= this.cars.length) {
            resize();
        }
        cars[count] = element;
        count = count + 1;
    }

    public void resize(){
        Car[] newGarage = new Car[this.cars.length * 2];
        for (int i = 0; i < this.count; i = i + 1){
            newGarage[i] = this.cars[i];
        }
        this.cars = newGarage;
    }

    public void removeByIndex(Car index) {
        for (int i = index; i < cars.length; i++){
            cars[i] = cars[i++];
        }
    }

    public Car getByIndex(Car index){
        return cars[index];
    }

    public String toString(){
        return Arrays.toString(this.cars);
    }
}