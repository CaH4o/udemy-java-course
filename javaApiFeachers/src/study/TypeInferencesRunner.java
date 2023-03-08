package study;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Ole", "Adam");
		List<String> names2 = List.of("Svet", "Tera");

		// List<List<String>> names = List.of(names1, names2);
		// type inference
		var names = List.of(names1, names2);

		names.stream().forEach(System.out::println);

		for (var name : names) {
			System.out.println(name);
		}

		var filter = List.of("Feta", "Olen").stream().filter(s -> s.length() < 5);
		filter.forEach(System.out::println);

		// not allowd
		// var nullVAlue = null;
	}

}
