package golovach.multithreading;

/**
 * Created by user on 10.06.2016.
 */
public class Silly {
    public static void main(String[] args) {

        for (int i = 0; i < 5000; i++) {
            SillyWork();
            System.out.println("Hello");
        }
    }

    private static void SillyWork() {
        double d = 0.0;
        for (int i = 0; i < 5000000; i++) {
            d = Math.sin(d);
        }
    }
}
