package com.study.BusinessCalculationServices.classes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationServices {

	private DataService dataService;

	@Autowired
	public BusinessCalculationServices(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(this.dataService.retriveData()).max().orElse(0);
	}
}
