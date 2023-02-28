package study;

import java.util.Arrays;

enum Season {
	SUMMER, WINTER, FALL, SPRING // 0, 1, 2, 3
}

enum SeasonMod {
	SUMMER(3), WINTER(1), FALL(4), SPRING(2);

	private int value;

	private SeasonMod(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

}

public class EnumRunner {

	public static void main(String[] args) {
		Season seasonA = Season.SUMMER;
		System.out.println(seasonA);

		Season seasonB = Season.valueOf("WINTER");
		System.out.println(seasonB);

		System.out.println(Season.SPRING.ordinal());

		System.out.println(Arrays.toString(Season.values()));

		System.out.println(SeasonMod.SPRING.getValue());

	}

}
