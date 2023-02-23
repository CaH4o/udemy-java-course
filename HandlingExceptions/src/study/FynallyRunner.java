package study;

import java.util.Scanner;

public class FynallyRunner {

	public static void main(String[] args) {
		runScannre();
		System.out.println("Main ends");
	}

	private static void runScannre() {
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };

			System.out.println(numbers[5]);
			System.out.println("Try ends");
			return;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("finnaly block");
			if (scanner != null)
				scanner.close();
		}
		System.out.println("Methods ends");
	}
}
