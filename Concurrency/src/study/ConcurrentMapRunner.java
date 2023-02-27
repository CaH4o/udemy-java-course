package study;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		String str = "ABCD ABCD ABCD A";

		/*
		 * Map<Character, LongAdder> occurance = new Hashtable<>();
		 * 
		 * for (char character : str.toCharArray()) { LongAdder longAdder =
		 * occurance.get(character);
		 * 
		 * if (longAdder == null) { longAdder = new LongAdder(); }
		 * longAdder.increment(); occurance.put(character, longAdder); }
		 */

		ConcurrentMap<Character, LongAdder> occurance = new ConcurrentHashMap<>();

		for (char character : str.toCharArray()) {
			occurance.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}

		System.out.println(occurance);
	}

}
