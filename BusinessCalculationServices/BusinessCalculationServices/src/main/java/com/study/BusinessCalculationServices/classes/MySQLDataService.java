package com.study.BusinessCalculationServices.classes;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Qualifier("MySQLDataServiceQualifier")
public class MySQLDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

}
