package study;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar mychar = new MyChar('c');
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isConsonant());
		System.out.println(mychar.isNumber());
		System.out.println(mychar.isAlphabet());
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();
	}

}
