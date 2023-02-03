package com.study.Spring.game;

public class MarioGame implements GaimingConsole {
	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("Go into a hole");
	}

	public void right() {
		System.out.println("Go back");
	}

	public void left() {
		System.out.println("Accelerate");
	}
}
