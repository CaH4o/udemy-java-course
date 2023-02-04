package com.study.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.study.Spring.game.GameRunner;

@Configuration
@ComponentScan("com.study.Spring.game")
public class GaimingAppLouncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GaimingAppLouncherApplication.class)) {
			context.getBean(GameRunner.class).run();

		}

	}

}
