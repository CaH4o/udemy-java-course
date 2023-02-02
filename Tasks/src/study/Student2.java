package study;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student2 {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student2(String name, int... marks) {
		this.name = name;

		for (int mark : marks)
			this.marks.add(mark);

	}

	public int getNumberOfMarks() {
		return this.marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;

		for (int mark : this.marks)
			sum = sum + mark;

		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(this.marks);
	}

	public int getMininumMark() {
		return Collections.min(this.marks);
	}

	public BigDecimal getAvarageMarks() {
		BigDecimal sum = new BigDecimal(this.getTotalSumOfMarks());
		BigDecimal number = new BigDecimal(this.getNumberOfMarks());

		return sum.divide(number, 3, RoundingMode.UP);
	}

	public void addNewMark(int mark) {
		this.marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		if (this.marks.size() > index)
			this.marks.remove(index);
	}

	@Override
	public String toString() {
		return this.name + ": " + this.marks;
	}
}
