package threads;

/**
 * Created by user on 09.10.2016.
 */
public class Solution2 {
    public static void main(String[] args) throws InterruptedException {
        new Thread2("Thread 2").start();
        Thread.sleep(100);
        System.out.println("main thread");

    }
}

class Thread2 extends Thread {

    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " thread");
    }
}
