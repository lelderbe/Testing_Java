package threads.executor_service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.*;

/**
 * Created by user on 02.05.2017.
 */
public class Solution {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> list = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            list.add(new Solution().new SomeThread("TTT" + i));
            executorService.execute(list.get(list.size() - 1));
        }

        TimeUnit.SECONDS.sleep(3);
//        Thread.sleep(3000);

        for (Thread thread : list) {

            thread.interrupt();
            System.out.println(thread.getState());
        }

        TimeUnit.SECONDS.sleep(3);
//        Thread.sleep(3000);




    }

    class SomeThread extends Thread {
        public SomeThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Inside thread #" + getName());
                try {
                    TimeUnit.MILLISECONDS.sleep(300);
//                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Thread #" + getName() + " is done...");
        }
    }

    class SomeRunnable implements Runnable {
        private int id;



        public SomeRunnable(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Inside thread #" + id);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Thread #" + id + " is done...");
        }
    }


}
