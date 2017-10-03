package threads.sync_test;

/**
 * Created by user on 12.10.2016.
 */
public class Solution implements Runnable{

    public static A a1 = new A();

    @Override
    public void run() {
        // Засыпаем на 1 секунду, чтобы поток main гарантированно начал первым
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            return;
        }
        int i = 5;
        while (i > 0) {
            // пытаемся вызвать method2, но засыпаем, ожидая окончания отработки с объектом потока main
            a1.method2();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            i--;
        }
        System.out.println("2 done");

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Solution());
        thread.start();

        a1.method1();               // Вызываем синхронизированный метод объекта a1 и работаем в нём 5 долгих секунд
        System.out.println("1 done");
    }
}

class A {
    public int i = 5;
    public String s = "Hello";

    public synchronized void method1() {
        int k = 5;
        while (k > 0) {
            System.out.println("Method 1: " + ++i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            k--;
        }

    }

    public synchronized void method2() {
        System.out.println("Method 2: " + --i);
    }
}
