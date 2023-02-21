package study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	public void run() {
		System.out.print("\nTask " + this.number + " - start: ");

		for (int i = this.number * 100; i < this.number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask " + this.number + " - done. ");
	}
}

public class ExecuterServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		System.out.print("\nTask 1 - kick off: ");
		executorService.execute(new Task(1));

		System.out.print("\nTask 2 - kick off: ");
		executorService.execute(new Task(2));

		System.out.print("\nTask 3 - kick off: ");
		executorService.execute(new Task(3));

		System.out.print("\nTask 4 - kick off: ");
		executorService.execute(new Task(4));

		System.out.print("\nTask 5 - kick off: ");
		executorService.execute(new Task(5));

		System.out.print("\nTask 6 - kick off: ");
		executorService.execute(new Task(6));

		System.out.print("\nTask 7 - kick off: ");
		executorService.execute(new Task(7));

		executorService.shutdown();
	}

}
