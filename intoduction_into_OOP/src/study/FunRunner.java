package study;

public class FunRunner {

	public static void main(String[] args) {
		Fun fun = new Fun("Manufacture", 0.53, "green");

		System.out.println(fun.toString());

		fun.switchOn();
		System.out.println(fun.toString());

		fun.setSpeed((byte) 3);
		System.out.println(fun.toString());

		fun.switchOff();
		System.out.println(fun.toString());
	}

}
