package study;

public class GameMario implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump up");

	}

	@Override
	public void right() {
		System.out.println("Goes formard");

	}

	@Override
	public void down() {
		System.out.println("Goes to a hole");

	}

	@Override
	public void left() {
		System.out.println("Go back");

	}

}
