package study;

import java.util.ArrayList;

public class GameRunner {

	public static void main(String[] args) {
		ArrayList<GamingConsole> console = new ArrayList<GamingConsole>();

		console.add(new GameMario());
		console.add(new GameChees());

		for (GamingConsole game : console) {
			game.up();
			game.right();
			game.down();
			game.left();
			System.out.println("");
		}

	}

}
