package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student thisStudent, Student thatStudent) {
		return Integer.compare(thatStudent.getId(), thisStudent.getId());
	}

}

public class StudentCollectionsRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ole"), new Student(2, "Ann"), new Student(0, "Sem"));
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println("Not Sort: " + studentsAl);

		Collections.sort(studentsAl);
		System.out.println("Asc:      " + studentsAl);

		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println("Dsc 1:    " + studentsAl);

		studentsAl.sort(new DescendingStudentComparator());
		System.out.println("Dsc 2:    " + studentsAl);
	}

}
