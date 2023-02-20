package study;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> list = List.of(4, 6, 8, 13, 3, 15);

		list.stream().forEach(n -> System.out.println(n));

		sumNumbers(list);

		sumFP(list);

		int sum = list.stream().filter(n -> n % 2 == 1).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);

		sum = list.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);

		IntStream.range(1, 11).forEach(n -> System.out.println(n));
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(e -> System.out.println(e));
		List.of("Apple", "Ant", "Bat").stream().forEach(e -> System.out.println(e.length()));
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.length()).forEach(e -> System.out.println(e));

		int maxV = list.stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(maxV);

		System.out.println(list.stream().filter(n -> n % 2 == 1).collect(Collectors.toList()));

		System.out.println(IntStream.range(1, 11).map(n -> n * n).boxed().collect(Collectors.toList()));
	}

	private static void sumFP(List<Integer> list) {
		int sum = list.stream().reduce(0, (n1, n2) -> {
			return n1 + n2;
		});
		System.out.println(sum);
	}

	private static void sumNumbers(List<Integer> list) {
		int sum = 0;
		for (int n : list) {
			sum += n;
		}
		System.out.println(sum);
	}

}
