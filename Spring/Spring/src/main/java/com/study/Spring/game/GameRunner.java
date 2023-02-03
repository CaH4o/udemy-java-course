package com.study.Spring.game;

public class GameRunner {
	private GaimingConsole game;

	public GameRunner(GaimingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);

		this.game.up();
		this.game.right();
		this.game.down();
		this.game.left();
	}

}
