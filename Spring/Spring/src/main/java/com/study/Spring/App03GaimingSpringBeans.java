package com.study.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.Spring.game.GameRunner;

public class App03GaimingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GaimingConfiguration.class)) {
			context.getBean(GameRunner.class).run();

		}

	}

}
