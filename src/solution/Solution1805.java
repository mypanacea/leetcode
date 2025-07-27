package solution;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Solution1805 {

	public static int numDifferentIntegers(String word) {
		boolean flag = false;
		StringBuilder sb = new StringBuilder();
		Set<String> retVal = new HashSet<>();
		for (char cur : word.toCharArray()) {
			if (!Character.isDigit(cur) && flag) {
				flag = false;
				String s = sb.toString();
				s = s.replaceFirst("^0+", "");
				retVal.add(s);
				sb = new StringBuilder();
			}
			if (Character.isDigit(cur) && flag) {
				sb.append(cur);
				continue;
			}
			if (Character.isDigit(cur)) {
				flag = true;
				sb.append(cur);
			}
		}
		String s = sb.toString();
		if (!s.equals("")) {
			s = s.replaceFirst("^0+", "");
			retVal.add(s);
		}

		return retVal.size();
	}

	public static void main(String[] args) {
		System.out.println(numDifferentIntegers("a1b01c001"));
	}
}
