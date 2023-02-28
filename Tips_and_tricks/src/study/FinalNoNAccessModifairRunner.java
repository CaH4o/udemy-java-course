package study;

class FirstClass {
	public void doSomthing() {
	}

	final public void finalMethode() {
	}
}

final class FinalClass extends FirstClass {
	@Override
	public void doSomthing() {
	}

	/*
	 * error
	 * 
	 * @Override
	 * 
	 * public void finalMethode() {}
	 */
}

// class NewClass extends FinalClass {} - error

public class FinalNoNAccessModifairRunner {

	public static void main(String[] args) {
		// 1
		final int i = 5;
		// i = 7; -error

		// 2
		final int j;
		j = 7;
		// j = 2; -error
	}

	// immutable programming
	public void finalMethodeArg(int arg1, final int arg2) {
		arg1 = 6;
		// arg2 = 23; -error
	}

}
