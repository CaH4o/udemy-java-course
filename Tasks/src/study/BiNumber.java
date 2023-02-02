package study;

public class BiNumber {

	private int numberFirest;
	private int numberSecond;

	BiNumber(int numberFirst, int numberSecond) {
		setNumberFirest(numberFirst);
		setNumberSecond(numberSecond);
	}

	public int getNumberFirest() {
		return numberFirest;
	}

	public void setNumberFirest(int numberFirest) {
		this.numberFirest = numberFirest;
	}

	public int getNumberSecond() {
		return numberSecond;
	}

	public void setNumberSecond(int numberSecond) {
		this.numberSecond = numberSecond;
	}

	public int add() {
		return this.numberFirest + this.numberSecond;
	}

	public int multiply() {
		return this.numberFirest * this.numberSecond;
	}

	public void doubles() {
		setNumberFirest(this.numberFirest * 2);
		setNumberSecond(this.numberSecond * 2);
	}
}
