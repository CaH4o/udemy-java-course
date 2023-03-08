package study;

public class SwitchExpressionRunner {

	public static String findDayOfTheWeek(int day) {
		String dayOfTheWeek = "";

		switch (day) {
		case 0:
			dayOfTheWeek = "Sunday";
			break;
		case 1:
			dayOfTheWeek = "Monday";
			break;
		case 2:
			dayOfTheWeek = "Tuesday";
			break;
		case 3:
			dayOfTheWeek = "Wednesday";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}

		return dayOfTheWeek;
	}

	public static String findDayOfTheWeekWithSweetchExpression(int day) {
		String dayOfTheWeek = switch (day) {
		case 0 -> "Sunday";
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> {
			System.out.println("Complex logic");
			yield "Wednesday";
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};

		return dayOfTheWeek;
	}

	public static void main(String[] args) {

	}

}
