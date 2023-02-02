package study;

public class MultiplicationTable {

	void print() {
		int factor = 5;

		print(factor);
	}

	void print(int factor) {
		int from = 1;
		int to = 10;

		print(factor, from, to);
	}

	void print(int factor, int from, int to) {
		for (; from <= to; ++from) {
			System.out.printf("%d * %d = %d", factor, from, factor * from).println();
		}
	}
}
