package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution412 {

	public static List<String> fizzBuzz(int n) {
		List<String> retVal = new ArrayList<>();
		if (n == 0) {
			return Collections.emptyList();
		}
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				retVal.add("FizzBuzz");
				continue;
			}
			if (i % 3 == 0) {
				retVal.add("Fizz");
				continue;
			}
			if (i % 5 == 0) {
				retVal.add("Buzz");
				continue;
			}
			retVal.add(String.valueOf(i));
		}
		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}
}
