package study;

import java.util.ArrayList;

public class BookOOP {

	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews;

	public BookOOP(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.reviews = new ArrayList<Review>();
	}

	public void addReview(Review review) {
		reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("Book:\n Name: %s;\n Author: %s;\n Reviews: %s", this.name, this.author, this.reviews);
	}

}
