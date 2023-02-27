package study;

public class Counter {
	private int value = 0;

	synchronized public void increment() {
		++this.value;
		// (1) get value, (2) increce it, (3) set value
	}

	public int getValue() {
		return this.value;
	}
}
