package com.study.BusinessCalculationServices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.study.BusinessCalculationServices.classes.BusinessCalculationServices;

@Configuration
@ComponentScan("com.study.BusinessCalculationServices.classes")
public class BusinessCalculationServicesApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationServicesApplication.class)) {

			System.out.println(context.getBean(BusinessCalculationServices.class).findMax());
		}
	}

}
