package study;

class Task1 extends Thread {
	public void run() {
		System.out.print("\nTask 1 - start: ");
		for (int i = 100; i < 200; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 1 - done. ");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask 2 - start: ");
		for (int i = 200; i < 300; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 2 - done. ");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// Task 1
		System.out.print("\nTask 1 - kick off: ");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// Task 2
		System.out.print("\nTask 2 - kick off: ");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		task1.join();

		// Task 3
		System.out.print("\nTask 3 - start: ");
		for (int i = 300; i < 400; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 3 - done. ");

		System.out.print("\nMain - done. ");
	}

}
