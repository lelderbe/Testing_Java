package nested.local_test_1;

import java.util.ArrayList;

/**
 * Created by user on 19.04.2017.
 */
public class Car
{
    public ArrayList createPoliceCars(int count)
    {
        ArrayList result = new ArrayList();

        class PoliceCar extends Car
        {
            int policeNumber;
            PoliceCar(int policeNumber)
            {
                this.policeNumber = policeNumber;
            }
        }

        for(int i=0; i<count; i++)
            result.add(new PoliceCar(i));
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Car> list = new Car().createPoliceCars(5);

        for (Car car : list) {
            System.out.println(car);

        }
    }

}