package solution;

import static java.util.stream.Collectors.toMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class Solution1935 {

	public static int canBeTypedWords(String text, String brokenLetters) {
		int[] temp = new int[26];
		for (int i = 0; i < brokenLetters.length(); i++) {
			temp[brokenLetters.charAt(i) - 97]++;
		}
		boolean flag = true;
		int retVal = 0;
		int count = 1;
		for (final char c : text.toCharArray()) {
			if (c == 32) {
				flag = true;
				count++;
				continue;
			}
			if (temp[c - 97] > 0 && flag) {
				flag = false;
				retVal++;
			}
		}
		return count - retVal;
	}

	public static void main(String[] args) {
		System.out.println(canBeTypedWords("hello world zxc", "ad"));
	}
}
