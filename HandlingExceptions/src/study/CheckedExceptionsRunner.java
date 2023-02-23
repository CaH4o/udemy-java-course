package study;

public class CheckedExceptionsRunner {
	public static void main(String[] agrs) {
		try {
			someMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static void someMethod() throws InterruptedException {
		Thread.sleep(2000);
	}

}
