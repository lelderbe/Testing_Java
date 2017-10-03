package threads.interrrupt_waiting;

/**
 * Created by user on 02.05.2017.
 */
public class Solution {
    public static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + ": Inside thread");

                synchronized (lock) {
                    try {
                        lock.wait();
//                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        System.out.println(getName() + ": Interrupted inside wait!");
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.setDaemon(true);
        System.out.println("Main thread");

        System.out.println(thread.getName() + ": " + thread.getState());    // NEW
        System.out.println("Starting " + thread.getName() + "...");
        thread.start();
        Thread.sleep(2000);
        System.out.println(thread.getName() + ": " + thread.getState());    // WAITING, TIMED_WAITING
        Thread.sleep(2000);

        thread.interrupt();
        Thread.sleep(3000);
        System.out.println(thread.getName() + ": " + thread.getState());    // TERMINATED

        System.out.println("After interrupt");

    }
}
