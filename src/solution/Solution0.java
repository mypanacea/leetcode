package solution;

import java.util.Arrays;

public class Solution0 {

	public static void main(String[] args) throws InterruptedException {
		Boolean[] arr = new Boolean[]{
				true, true, true, false,
				true, true, true, true,
				true, false, true, false,
				true, false, false, true,
				true, true, true, true,
				false, false, true, true
		};
		System.out.println(solution(arr));
	}

	public static int solution(final Boolean[] input) {
		return (int) Arrays
				.stream(input, 0, input.length)
				.filter(b -> b != null && b)
				.count();
	}
}