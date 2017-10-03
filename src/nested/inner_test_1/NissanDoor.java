package nested.inner_test_1;

/**
 * Created by user on 19.04.2017.
 */
public class NissanDoor extends Car.Door {
    public NissanDoor(Car car) {
        car.super();
    }

    public static void main(String[] args) {
        NissanDoor nissanDoor = new NissanDoor(new Car());
    }
}
