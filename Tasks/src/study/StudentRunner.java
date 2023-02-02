package study;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = new int[5];

		for (int i = 0; i < marks.length; ++i) {
			marks[i] = (int) (Math.random() * 10.0) + 1;
		}
		System.out.println(Arrays.toString(marks));

		// Student student = new Student("Ole", marks);
		Student2 student = new Student2("Ole", marks);
		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMininumMark();
		BigDecimal average = student.getAvarageMarks();

		System.out.println("Number of marks:" + number);
		System.out.println("Sum of marks:" + sum);
		System.out.println("The max mark is:" + maximumMark);
		System.out.println("The min mark is:" + minimumMark);
		System.out.println("Average of marks:" + average);

		System.out.println(student);
		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(4);
		System.out.println(student);
	}

}
