package study;

public class Book {
	private short noOfCopies;

	Book() {
		this((short) 0);
	}

	Book(short noOfCopies) {
		setNoOfCopies((short) (noOfCopies));
	}

	public short getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(short noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	public void increaseNoOfCopies(short howMuch) {
		setNoOfCopies((short) (this.noOfCopies + howMuch));
	}

	public void decreaseNoOfCopies(short howMuch) {
		setNoOfCopies((short) (this.noOfCopies - howMuch));
	}

	void read() {
		System.out.println("The cool book is read");
	}
}
