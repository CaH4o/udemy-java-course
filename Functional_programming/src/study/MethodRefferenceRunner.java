package study;

import java.util.List;

public class MethodRefferenceRunner {

	public static void print(int e) {
		System.out.println(e);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(e -> System.out.println(e));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(MethodRefferenceRunner::print);

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);

		Integer max = List.of(21, 45, 67, 34).stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);

		max = List.of(21, 45, 67, 34).stream().filter(MethodRefferenceRunner::isEven).max(Integer::compare).orElse(0);
		System.out.println(max);

	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
}
