package study;

public class BlocksRunner {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("mian start " + i);

		{
			System.out.println("block start " + i);
			// int i = 1; - error
			i = 1;
			int j = -1;
			System.out.println("block end " + i + ", " + j);
		}

		System.out.println("mian end " + i + ", " /* + j - error */);
	}

}
