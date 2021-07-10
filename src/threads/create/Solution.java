package threads.create;

public class Solution {

	public static class A extends Thread {
		private String name;

		public A(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println("run of class" + this.getClass().getName() + " #" + name);

			for (int i = 0; i < 10; i++) {
				System.out.println("Thread #" + name + " i: " + i);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static class B implements Runnable {
		private String name;

		public B(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println("run of class" + this.getClass().getName() + " #" + name);

			for (int i = 0; i < 10; i++) {
				System.out.println("Thread #" + name + " i: " + i);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void run_runnable() {
		B b1 = new B("1");
		B b2 = new B("2");
		B b3 = new B("3");

		Thread th1 = new Thread(b1);
		th1.start();
//        th1.join();
		new Thread(b2).start();
		new Thread(b3).start();
	}

	public static void run_thread() {
		A th1 = new A("1");
		th1.start();
		new A("2").start();
		new A("3").start();
	}

	public static void main(String[] args) throws InterruptedException {
//		run_runnable();
		run_thread();
	}
}
