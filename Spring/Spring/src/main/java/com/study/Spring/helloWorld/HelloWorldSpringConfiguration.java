package com.study.Spring.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldSpringConfiguration {

	@Bean
	public String name() {
		return "Ole";
	}

	@Bean
	public int age() {
		return 35;
	}

	@Bean
	public Person person() {
		return new Person("Sara", 20, new Address("West", "Helsinki"));
	}

	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean
	@Primary
	public Person person4(String name, int age, Address address) {
		return new Person(name, age, address);
	}

	@Bean
	public Person person5(String name, int age, @Qualifier("addressQ") Address address) {
		return new Person(name, age, address);
	}

	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Jota", "Aanekoski");
	}

	@Bean(name = "address3")
	@Qualifier("addressQ")
	public Address address3() {
		return new Address("Tumma", "Pori");
	}

}
