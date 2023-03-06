package study.util;

import java.util.List;

import study.algorithm.BubbleSort;

public class MySorting {

	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort(); 	
		return bubbleSort.sort(names);
	}
}
