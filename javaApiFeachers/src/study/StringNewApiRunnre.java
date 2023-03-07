package study;

public class StringNewApiRunnre {

	public static void main(String[] args) {
		System.out.println("".isBlank());
		System.out.println(" ".isBlank());
		System.out.println(" L R ".isBlank());
		System.out.println(" L R ".strip().replace(" ", "@"));
		System.out.println(" L R ".stripLeading().replace(" ", "@"));
		System.out.println(" L R ".stripTrailing().replace(" ", "@"));
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is %s. My age is %d.".formatted("Ranga", 23));

	}

}
