package study;

public class HandlingExceptionsRunner {
	public static void main(String[] args) {
		Method1();

		System.out.println("Main ends");
	}

	private static void Method1() {
		method2();

		System.out.println("Methods1 ends");
	}

	private static void method2() {
		String str = null;
		str.length();

		System.out.println("Methods2 ends");
	}
}
