package solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1897 {

	public static boolean makeEqual(String[] words) {
		return Stream.of(words)
				.map(String::chars)
				.flatMap(s -> s.mapToObj(s1 -> (char) s1))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values().stream()
				.allMatch(s -> s % words.length != 0);
	}

	public static void main(String[] args) {
		System.out.println(makeEqual(new String[]{"abc", "aabc", "bc"}));
	}
}
