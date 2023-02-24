package study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		// 1
		// Files.list(Paths.get(".")).forEach(System.out::println);

		// 2
		// Path currentDirection = Paths.get(".");
		// Predicate<? super Path> pridicate = path ->
		// String.valueOf(path).contains(".java");
		// Files.walk(currentDirection,
		// 4).filter(pridicate).forEach(System.out::println);

		// 3
		Path currentDirection = Paths.get(".");
		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path)
				.contains(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();

		Files.find(currentDirection, 4, javaMatcher).forEach(System.out::println);
		System.out.println();
		Files.find(currentDirection, 4, directoryMatcher).forEach(System.out::println);

	}

}
