package solution;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution169 {

	public static void main(String[] args) {
		majorityElement(new int[]{1, 1, 2, 2, 2, 3});
	}

	//very low speed solution, faster then 25%
	public static int majorityElement(int[] nums) {
		return IntStream.of(nums)
				.boxed()
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(0);
	}
}
