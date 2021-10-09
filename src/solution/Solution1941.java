package solution;

import java.util.HashSet;
import java.util.Set;

public class Solution1941 {

	public static boolean areOccurrencesEqual(String s) {
		int[] res = new int[32];
		int max = 0;
		for (char c : s.toCharArray()) {
			res[c - 97]++;
			max = Math.max(res[c - 97], max);
		}

		for (int i : res) {
			if (i != 0 && max != i) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(areOccurrencesEqual("abacbc"));
	}
}
