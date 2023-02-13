package com.study;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

	static <X extends List> void getDuplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumbers(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	// Upper Bound
	static void rendomValue(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

	// Lower Bound
	public static void main(String[] args) {
		// 1
		MyCustomList<String> list = new MyCustomList<>();
		list.addElementList("One");
		list.addElementList("Two");
		System.out.println(list);

		String value = list.get(0);
		System.out.println(value);

		// 2
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElementList(Integer.valueOf(1));
		list2.addElementList(Integer.valueOf(2));
		System.out.println(list2);

		Integer value2 = list2.get(0);
		System.out.println(value2);

		// 3
		System.out.println(MyCustomList.returnValue("return"));

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 4));
		getDuplicate(numbers);
		System.out.println(numbers);

		// 4
		System.out.println(sumOfNumbers(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumbers(List.of(1.2, 2, 3, 3.4, 4.5, 5.6)));
		System.out.println(sumOfNumbers(List.of(1l, 2l, 3l, 4l, 5l)));

		// 5
		List emptyList = new ArrayList<Number>();
		rendomValue(emptyList);
		System.out.println(emptyList);

	}

}
