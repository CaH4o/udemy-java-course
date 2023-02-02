package study;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return this.length + this.width;
	}

	public int perimeter() {
		return (this.length + this.width) * 2;
	}

	@Override
	public String toString() {
		return String.format("Rectangle:\n Length: %d\n Width: %d\n Area: %d\n Perimeter: %d.", this.length, this.width,
				this.area(), this.perimeter());
	}
}
