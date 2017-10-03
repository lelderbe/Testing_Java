package threads.cancel_test;

/**
 * Created by user on 09.10.2016.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread2 child = new Thread2();
        Thread child_thread = new Thread(child);
        System.out.println("main thread");
        child_thread.start();
        Thread.sleep(2000);
        System.out.println("Cancel it!");
//        child.setCancel(true);
        child.cancel();
    }
}

class Thread2 implements Runnable {

    private boolean isCancel = false;

    public void setCancel(boolean cancel) {
        isCancel = cancel;
    }

    public void cancel() {
        isCancel = true;
    }

    @Override
    public void run() {
        while (!isCancel) {
            System.out.println("Thread2...");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("I'm canceled... ");

    }
}
