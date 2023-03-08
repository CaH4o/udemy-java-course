package study;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String textBlock = """
				Line1
					Line /2
					Line "3"
						Line4
						Line5: %s
				!Line6""".formatted("Five");

		System.out.println(textBlock);
	}

}
