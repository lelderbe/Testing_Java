package threads.test1;

/**
 * Created by user on 10.10.2016.
 */
public class Solution {
    private static final int COUNT = 256;

    public static void main(String[] args) throws InterruptedException {

        int[] array = new int[100_000_000];
        array[1_000] = 1;
        array[40_000_000] = 2;
        array[60_000_000] = 3;
        array[90_000_000] = 4;

        MyRunnable[] runners = new MyRunnable[COUNT];
        Thread[] threads = new Thread[COUNT];

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            runners[i] = new MyRunnable(array, array.length / COUNT * i, array.length / COUNT * (i + 1));
            threads[i] = new Thread(runners[i]);
            threads[i].start();
        }

        for (int i = 0; i < COUNT; i++) {
            threads[i].join();
        }

        long t1 = System.currentTimeMillis();
        System.out.println("Time= " + (t1 - t0));

        for (int i = 0; i < COUNT; i++) {
            System.out.println(runners[i].maxValue);
        }
    }
}


class MyRunnable implements Runnable {

    private final int[] array;
    private final int from;
    private final int to;
    public volatile int maxValue;

    public MyRunnable(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        maxValue = array[from];
        for (int i = from; i < to; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

//        System.out.println(maxValue);

    }
}
