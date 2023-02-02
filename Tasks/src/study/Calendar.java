package study;

public class Calendar {

	public static void main(String[] args) {
		System.out.println(isWeekDay(0));
		System.out.println(isWeekDay(1));
		System.out.println(determineNameOfMonth(3));
		System.out.println(determineNameOfDay(6));
	}

	public static boolean isWeekDay(int weekDayNumber) {
		return weekDayNumber > 0 && weekDayNumber < 6;
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 0: {
			return "January";
		}
		case 1: {
			return "February";
		}
		case 2: {
			return "March";
		}
		case 3: {
			return "April";
		}
		case 4: {
			return "May";
		}
		case 5: {
			return "June";
		}
		case 6: {
			return "Jule";
		}
		case 7: {
			return "August";
		}
		case 8: {
			return "September";
		}
		case 9: {
			return "October";
		}
		case 10: {
			return "November";
		}
		case 11: {
			return "December";
		}
		default:
			return "Not mached";
		}
	}

	public static String determineNameOfDay(int weekDayNumber) {
		switch (weekDayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Thursday";

		case 3:
			return "Wednesday";

		case 4:
			return "Thouthday";

		case 5:
			return "Friday";

		case 6:
			return "Saturday";

		default:
			return "Not mached";
		}
	}

}
