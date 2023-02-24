package study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/createdFile.txt");

		List<String> listToFile = List.of("Apple", "Banana", "Cat", "Dog");

		Files.write(pathFileToWrite, listToFile);
	}

}
