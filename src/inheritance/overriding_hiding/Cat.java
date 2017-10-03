package inheritance.overriding_hiding;

/**
 * Created by user on 15.06.2017.
 */
public class Cat extends Animal {
    public String name = "Cat";

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Cat();

        Cat.testClassMethod();
        cat.testInstanceMethod();

        Animal.testClassMethod();
        animal.testInstanceMethod();

        System.out.println(cat.name);
        System.out.println(animal.name);

    }
}