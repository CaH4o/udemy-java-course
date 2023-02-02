package study;

public class Review {
	private int id;
	private String description;
	private int raiting;

	public Review(int id, String description, int raiting) {
		super();
		this.id = id;
		this.description = description;
		this.raiting = raiting;
	}

	@Override
	public String toString() {
		return String.format("(%d/5) %s", this.raiting, this.description);
	}
}
