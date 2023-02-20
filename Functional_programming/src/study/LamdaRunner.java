package study;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class NumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer numebr) {
		return numebr % 2 == 0;
	}
}

class NumberConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);

	}
}

class NumberMap implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}

}

public class LamdaRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 45, 48).stream().map(n -> n * n).filter(n -> n % 2 == 0)
				.forEach(e -> System.out.println(e));

		System.out.println("");

		List.of(23, 43, 34, 45, 36, 45, 48).stream().map(new NumberMap()).filter(new NumberPredicate())
				.forEach(new NumberConsumer());

		System.out.println("");

		Function<? super Integer, ? extends Integer> squereFunction = n -> n * n;
		Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
		Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

		List.of(23, 43, 34, 45, 36, 45, 48).stream().map(squereFunction).filter(evenPredicate)
				.forEach(System.out::println);
	}

}
