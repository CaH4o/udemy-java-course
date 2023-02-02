package study;

public class BookOOPRunner {

	public static void main(String[] args) {
		BookOOP book = new BookOOP(123, "Some OOP book", "Ole");
		System.out.println(book);

		book.addReview(new Review(10, "Grate book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		System.out.println(book);
	}

}
