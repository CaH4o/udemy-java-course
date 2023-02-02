package study;

public class StringArrays {

	public static void main(String[] args) {
		String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String longestWeekDay = "";
		for (String weekDay : weekDays)
			if (longestWeekDay.length() < weekDay.length())
				longestWeekDay = weekDay;
		System.out.println(longestWeekDay);

		for (int i = weekDays.length - 1; i >= 0; --i)
			System.out.println(weekDays[i]);

	}

}
