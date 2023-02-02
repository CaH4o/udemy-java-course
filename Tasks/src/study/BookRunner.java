package study;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgrammig = new Book((short) 400);
		Book effectiveJava = new Book((short) 400);
		Book cleanCode = new Book((short) 400);

		artOfComputerProgrammig.read();
		effectiveJava.read();
		cleanCode.read();

	}

}
