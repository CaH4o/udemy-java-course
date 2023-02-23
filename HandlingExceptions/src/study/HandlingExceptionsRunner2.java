package study;

public class HandlingExceptionsRunner2 {
	public static void main(String[] args) {
		Method1();

		System.out.println("Main ends");
	}

	private static void Method1() {
		method2();

		System.out.println("Methods1 ends");
	}

	private static void method2() {
		try {
			// String str = null;
			// str.length();

			int[] arr = { 1, 2 };
			int value = arr[3];

			System.out.println("Methods2 ends");
		} catch (NullPointerException e) {
			System.out.println("Mached NullPointerException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mached ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Mached Exception");
			e.printStackTrace();
		}

	}
}
