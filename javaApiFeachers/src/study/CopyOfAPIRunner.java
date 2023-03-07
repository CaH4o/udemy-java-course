package study;

import java.util.ArrayList;
import java.util.List;

public class CopyOfAPIRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ole");
		names.add("Nalya");
		names.add("Maxa");

		doNotChange(names);
		System.out.println(names);

		List<String> copyOfNames = List.copyOf(names);
		doNotChange(copyOfNames);
		System.out.println(copyOfNames);

	}

	private static void doNotChange(List<String> names) {
		names.add("Added");

	}

}
