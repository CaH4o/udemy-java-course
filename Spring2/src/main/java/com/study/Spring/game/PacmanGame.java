package com.study.Spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GaimingConsole {
	public void up() {
		System.out.println("Look at up");
	}

	public void down() {
		System.out.println("Slow");
	}

	public void right() {
		System.out.println("See to right");
	}

	public void left() {
		System.out.println("See to left");
	}

}
