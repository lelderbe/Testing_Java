package threads.interrupt_test;

/**
 * Created by user on 09.10.2016.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread child = new Thread() {
            @Override
            public void run() {
                System.out.println("In Thread2");

                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread2...");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                System.out.println("I'm interrupted");
            }
        };

        System.out.println("Main thread");
        child.start();
        Thread.sleep(2000);
        System.out.println("interrupt it!");
        child.interrupt();

    }
}
