package study;

public class MyChar {
	private char myChat;

	public MyChar(char aChar) {
		this.myChat = aChar;
	}

	public boolean isVowel() {
		switch (this.myChat) {
		case 'A': {
			return true;
		}
		case 'E': {
			return true;
		}
		case 'I': {
			return true;
		}
		case 'O': {
			return true;
		}
		case 'U': {
			return true;
		}
		case 'a': {
			return true;
		}
		case 'e': {
			return true;
		}
		case 'i': {
			return true;
		}
		case 'o': {
			return true;
		}
		case 'u': {
			return true;
		}
		default:
			return false;
		}
	}

	public boolean isConsonant() {
		if (this.isAlphabet())
			return !this.isVowel();

		return false;
	}

	public boolean isNumber() {
		return this.myChat >= '0' && this.myChat <= '9';
	}

	public boolean isAlphabet() {
		return this.myChat >= 'a' && this.myChat <= 'z' || this.myChat >= 'A' && this.myChat <= 'Z';
	}

	public static void printLowerCaseAlphabet() {
		for (int i = 'a'; i <= 'z'; ++i) {
			System.out.println((char) i);
		}
	}

	public static void printUpperCaseAlphabet() {
		for (int i = 'A'; i <= 'Z'; ++i) {
			System.out.println((char) i);
		}
	}

}
