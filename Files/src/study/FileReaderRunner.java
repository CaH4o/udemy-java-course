package study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToRead = Paths.get("./resources/data.txt");

		// 1
		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		Files.lines(pathFileToRead).filter(e -> e.length() > 5).map(String::toLowerCase).forEach(System.out::println);

	}

}
