package study;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2, menu;

		System.out.print("Enter the first number: ");
		number1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		number2 = scanner.nextInt();

		do {
			System.out.println('\n' + "Choose: ");
			System.out.println("1 - Add");
			System.out.println("2 - Subtract");
			System.out.println("3 - Divide");
			System.out.println("4 - Multiply");
			System.out.println("5 - Exit");
			menu = scanner.nextInt();

			switch (menu) {
			case 1: {
				System.out.printf("%d + %d = %d", number1, number2, number1 + number2);
				break;
			}
			case 2: {
				System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
				break;
			}
			case 3: {
				System.out.printf("%d / %d = %d", number1, number2, number1 / number2);
				break;
			}
			case 4: {
				System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
				break;
			}
			case 5: {
				System.out.println("Thanks! See you!");
				break;
			}
			default:
				System.out.println("Error chose!" + '\n');
			}

		} while (menu != 5);

		scanner.close();

	}
}
