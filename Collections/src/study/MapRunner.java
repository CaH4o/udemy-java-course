package study;

import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		String string = "This is an awsome occasion. This has never happened before.";

		Map<Character, Integer> map = new TreeMap<>();
		char[] characters = string.toCharArray();

		for (char ch : characters) {
			Integer count = map.get(ch);

			if (count == null) {
				map.put(ch, 1);
			} else {
				map.put(ch, count + 1);
			}
		}

		System.out.println(map);

		Map<String, Integer> words = new TreeMap<>();
		String[] strings = string.split(" ");

		for (String str : strings) {
			Integer count = words.get(str);

			if (count == null) {
				words.put(str, 1);
			} else {
				words.put(str, count + 1);
			}
		}

		System.out.println(words);
	}

}
