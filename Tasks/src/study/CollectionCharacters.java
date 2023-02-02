package study;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionCharacters {

	public static void main(String[] args) {
		List<Character> characters = List.of('C', 'A', 'Z', 'A', 'B', 'Z', 'F', 'D');

		Set<Character> uniqCharacters = new TreeSet<>(characters);
		System.out.println(uniqCharacters);

		Set<Character> notSortedUniqCharacters = new LinkedHashSet<>(characters);
		System.out.println(notSortedUniqCharacters);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println(hashSet);
	}

	// Set: Tree, Hash, LinkedHash
}
