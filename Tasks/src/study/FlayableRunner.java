package study;

import java.util.ArrayList;

interface Flyable {
	void fliy();
}

class Bird implements Flyable {
	@Override
	public void fliy() {
		System.out.println("with wings");
	}
}

class Aeroplane implements Flyable {
	@Override
	public void fliy() {
		System.out.println("with fuel");
	}
}

public class FlayableRunner {

	public static void main(String[] args) {

		ArrayList<Flyable> flyingObjects = new ArrayList<>();
		flyingObjects.add(new Bird());
		flyingObjects.add(new Aeroplane());

		for (Flyable object : flyingObjects)
			object.fliy();

	}

}
