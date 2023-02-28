package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 1
class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
	}
}*/

public class AnonymusClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(List.of("Ant", "Ball", "Cat", "Dog", "Elephant"));

		// 1
		// Collections.sort(animals, new LengthComparator());

		// 2
		/*
		 * Collections.sort(animals, new Comparator<String>() {
		 * 
		 * @Override public int compare(String s1, String s2) { return
		 * Integer.compare(s1.length(), s2.length()); } });
		 */

		// 3
		Comparator<String> lengthComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		Collections.sort(animals, lengthComparator);

		System.out.println(animals);

	}

}
