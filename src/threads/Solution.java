package threads;

/**
 * Created by user on 09.10.2016.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
//        new Thread(new Thread1("Thread1")).start();
        Thread thread1 = new Thread(new Thread1("Thread1"));
        Thread thread2 = new Thread(new Thread1("Thread2"));
        thread1.start();
        thread2.start();
        Thread.sleep(100);
        System.out.println("main thread");
    }
}


class Thread1 implements Runnable {

    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " thread");
    }
}
