package solution;
//both of these solutions are faster than 100% but solution with loop required a bit more memory
public class Solution2000 {

	public static String reversePrefix(String word, char ch) {
//		for (int i = 0; i < word.length(); i++) {
//			if (word.charAt(i) == ch) {
//				return new StringBuilder(word.substring(0, i + 1))
//						.reverse()
//						.append(word.substring(i + 1))
//						.toString();
//			}
//		}
//		return word;
		if (!word.contains(String.valueOf(ch))) {
			return word;
		}
		int position = word.indexOf(ch) + 1;

		return new StringBuilder(word.substring(0, position))
				.reverse()
				.append(word.substring(position))
				.toString();
	}

	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefd", 'd'));
	}
}
