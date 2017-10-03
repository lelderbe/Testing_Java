package golovach.multithreading;

/**
 * Created by user on 10.06.2016.
 */
public class Solution {
    public static final int N = 100_000_000;
    public static int counter = 0;

    public static synchronized void inc() {
        counter++;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) {
//                    counter++;
                    inc();
                }
            }
        });

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) {
//                    counter++;
                    inc();
                }
            }
        });

        t0.start();
        t1.start();

        t0.join();
        t1.join();

        System.out.println(counter);
    }
}
