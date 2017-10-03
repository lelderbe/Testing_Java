package threads.uncought;

/**
 * Created by user on 24.04.2017.
 */
public class Solution implements Thread.UncaughtExceptionHandler {
    public static void main(final String args[]) {
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread arg0, Throwable arg1) {
                //throw new java.lang.RuntimeException("e2");
                System.out.println("ddddddddddd");
            }
        });
        throw new RuntimeException("e1");
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {

    }
}
