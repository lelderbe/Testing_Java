package abstracts;

/**
 * Created by user on 09.05.2016.
 */
public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.truck = new Truck();
        car1.truck.brand = "URAL";
        Car car2 = car1.clone();

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.brand);
        System.out.println(car2.brand);

        System.out.println(car1.truck);
        System.out.println(car2.truck);

        System.out.println(car1.truck.brand);
        System.out.println(car2.truck.brand);

        String s = "abc";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }


        String s1="I'm learning how to compare Strings";
        String s2="I'm learning how to compare Strings";
        if (s1 == s2) {
            System.out.println ("s1 and s2 are the same");
        }else{
            System.out.println ("s1 and s2 are different");
        }



//        Object obj1 = new Object();
//        Object obj2 = obj1.c

        Vehicle[] vehicles = {new Car(), new Car()};

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.info());
        }

        System.out.println(div(24, 4));


        int y = 2;
        for (int i = 0; i < 3; i++) {
            y--;
            assert y >= 0;
        }

        double z = Math.abs(2.3);

        String s22 = "string";
//        int l1 = s22.

    }

    public static int div(int num, int divisor) {
        if (num < divisor) {
            return 0;
        } else {
            return 1 + div(num - divisor, divisor);
        }
    }



}
