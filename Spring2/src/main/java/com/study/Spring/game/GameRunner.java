package com.study.Spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GaimingConsole game;

	public GameRunner(@Qualifier("SuperContraGameQualifier") GaimingConsole game) {
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
