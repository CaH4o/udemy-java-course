package study;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		runScannre();
		System.out.println("Main ends");
	}

	private static void runScannre() {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 12, 3, 4, 5 };
			System.out.println(numbers[23]);
		}
		/*
		 * catch() {} finally {}
		 */
	}
}
