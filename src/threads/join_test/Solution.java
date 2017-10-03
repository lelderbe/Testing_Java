package threads.join_test;

/**
 * Created by user on 09.10.2016.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread, before Thread 2");
        Thread thread = new Thread(new Thread2());
        thread.start();

        thread.join();
        System.out.println("Main thread, after Thread 2");
        thread.start();


    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside Thread2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread2 is done");
    }
}
