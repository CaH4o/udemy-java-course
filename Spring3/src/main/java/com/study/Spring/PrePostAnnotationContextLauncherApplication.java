package com.study.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependency are redy.");
	}

	@PostConstruct
	public void initialize() {
		this.someDependency.getReady();
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUp.");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic.");
	}

}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)) {

		}

	}

}
