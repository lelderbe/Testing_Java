package abstracts;

/**
 * Created by user on 09.05.2016.
 */
public class Car extends Vehicle implements Cloneable {
    public String brand = "Toyota";
    public Truck truck;

    @Override
    public String info() {
        return "Car";
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
}
