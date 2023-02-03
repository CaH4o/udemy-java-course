package com.study.Spring;

import com.study.Spring.game.GameRunner;
import com.study.Spring.game.PacmanGame;

public class App01GaimingBaisicJava {

	public static void main(String[] args) {

		// var game = new SuperContraGame();
		var game = new PacmanGame();
		// var game = new MarioGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
