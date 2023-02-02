package study;

import java.util.Scanner;

public class DoWhileNumberPlayerRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		do {
			System.out.print("Enter a number, negativ number is quit: ");
			number = scanner.nextInt();

			if (number >= 0) {
				System.out.println("Cube is " + (number * number * number));
			} else {
				System.out.println("Thank you! Have Fun!");
			}

		} while (number >= 0);

	}

}
