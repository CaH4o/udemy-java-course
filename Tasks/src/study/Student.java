package study;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return this.marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;

		for (int mark : this.marks)
			sum = sum + mark;

		return sum;
	}

	public int getMaximumMark() {
		int max = Integer.MIN_VALUE;

		for (int mark : this.marks)
			max = max < mark ? mark : max;

		return max;
	}

	public int getMininumMark() {
		int min = Integer.MAX_VALUE;

		for (int mark : this.marks)
			min = min > mark ? mark : min;

		return min;
	}

	public BigDecimal getAvarageMarks() {
		BigDecimal sum = new BigDecimal(this.getTotalSumOfMarks());
		BigDecimal number = new BigDecimal(this.getNumberOfMarks());
		return sum.divide(number, 3, RoundingMode.UP);
	}

	public void addNewMark(int mark) {
		int len = this.marks.length + 1;
		int[] newMarks = new int[len];

		for (int i = 0; i < len; ++i) {
			newMarks[i] = (i != (len - 1)) ? this.marks[i] : mark;
		}

		this.marks = newMarks;
	}

	public void removeMarkAtIndex(int index) {
		if (index >= this.marks.length)
			return;

		int len = this.marks.length - 1;
		int[] newMarks = new int[len];

		for (int i = 0, j = 0; i < this.marks.length; ++i) {
			if (i == index)
				continue;
			newMarks[j++] = this.marks[i];
		}

		this.marks = newMarks;
	}

}
