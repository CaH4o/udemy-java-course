package com.study.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.Spring.game.GaimingConsole;
import com.study.Spring.game.GameRunner;
import com.study.Spring.game.MarioGame;
import com.study.Spring.game.PacmanGame;
import com.study.Spring.game.SuperContraGame;

@Configuration
public class GaimingConfiguration {

	@Bean
	public GaimingConsole game() {
		return new PacmanGame();
	}

	@Bean
	public GaimingConsole game2() {
		return new SuperContraGame();
	}

	@Bean
	public GaimingConsole game3() {
		return new MarioGame();
	}

	@Bean
	public GameRunner gameRunner(GaimingConsole game) {
		return new GameRunner(game);
	}
}
