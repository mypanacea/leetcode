package solution;

import java.util.HashSet;
import java.util.Set;

public class Solution1903 {

	public static String largestOddNumber(String num) {
		int max = Integer.MIN_VALUE;
		max = Math.max(max, num.lastIndexOf('1'));
		max = Math.max(max, num.lastIndexOf('3'));
		max = Math.max(max, num.lastIndexOf('5'));
		max = Math.max(max, num.lastIndexOf('7'));
		max = Math.max(max, num.lastIndexOf('9'));

		return num.substring(0, max + 1);
	}

	public static void main(String[] args) {
		System.out.println(largestOddNumber("11"));
	}
}
