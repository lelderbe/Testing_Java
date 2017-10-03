package nested.nested_test_1;

/**
 * Created by user on 19.04.2017.
 */
public class Car {
    private static int id = 15;

    public static class Door {
        public Door() {
            System.out.println("Door created for car id: " + id);
        }
    }

    public static void main(String[] args) {
        Door door = new Door();
        Car.Door door2 = new Car.Door();
    }
}
