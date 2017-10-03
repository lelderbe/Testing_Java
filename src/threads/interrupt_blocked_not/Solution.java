package threads.interrupt_blocked_not;

/**
 * Created by user on 02.05.2017.
 */
public class Solution {
    public static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread("Thread1") {
            @Override
            public void run() {
                System.out.println(getName() + ": Inside thread");

                synchronized (lock) {
                    System.out.println(getName() + ": Inside synchronized");

                    try {
//                        lock.wait();
                        Thread.sleep(100000);
                    } catch (InterruptedException e) {
                        System.out.println(getName() + ": Interrupted inside wait!");
                        e.printStackTrace();
                    }

                    System.out.println(getName() + ": After sleep()");
                }
            }
        };

        Thread thread2 = new Thread("Thread2") {
            @Override
            public void run() {
                System.out.println(getName() + ": Inside thread");

                synchronized (lock) {
                    System.out.println(getName() + ": Inside synchronized");

                    try {
//                        lock.wait();
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(getName() + ": Interrupted inside wait!");
                        e.printStackTrace();
                    }

                    System.out.println(getName() + ": After sleep()");
                }
            }
        };


        thread1.setDaemon(true);
        thread2.setDaemon(true);
        System.out.println("Main thread");

        System.out.println(thread1.getName() + ": " + thread1.getState());    // NEW
        System.out.println(thread2.getName() + ": " + thread2.getState());    // NEW
        System.out.println("Starting " + thread1.getName() + "...");
        thread1.start();

        System.out.println("Waiting 2s before starting " + thread2.getName());
        Thread.sleep(2000);

        System.out.println("Starting " + thread2.getName() + "...");
        thread2.start();

        Thread.sleep(2000);

        System.out.println(thread1.getName() + ": " + thread1.getState());
        System.out.println(thread2.getName() + ": " + thread2.getState());

        System.out.println("Interrupting " + thread2.getName());
        thread2.interrupt();

        Thread.sleep(2000);

        System.out.println(thread2.getName() + ": " + thread2.getState());

        System.out.println("Main thread end");


    }
}
