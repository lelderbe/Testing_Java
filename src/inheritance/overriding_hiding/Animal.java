package inheritance.overriding_hiding;

/**
 * Created by user on 15.06.2017.
 */
public class Animal {
    public String name = "Animal";

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

}