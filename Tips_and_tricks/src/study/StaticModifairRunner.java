package study;

class Player {
	private String name;
	private static int count = 0;

	public Player(String name) {
		this.name = name;
		++count;
	}

	static public int getCount() {
		return count;
	}
}

public class StaticModifairRunner {
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	public static final int SECONDS_IN_DAY = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;

	public static void showSecondsInDay() {
		System.out.println(SECONDS_IN_DAY);
	}

	public static void main(String[] args) {

		Player pl1 = new Player("Adam");

		System.out.println(Player.getCount());

		Player pl2 = new Player("Bonny");
		Player pl3 = new Player("Emma");

		System.out.println(Player.getCount());

		StaticModifairRunner.showSecondsInDay();
	}

}
