package solution;

public class Solution1880 {

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		StringBuilder a = new StringBuilder();
		for (var i = 0; i < firstWord.length(); i++) {
			a.append(firstWord.charAt(i) - 97);
		}
		StringBuilder b = new StringBuilder();
		for (var i = 0; i < secondWord.length(); i++) {
			b.append(secondWord.charAt(i) - 97);
		}
		StringBuilder c = new StringBuilder();
		for (var i = 0; i < targetWord.length(); i++) {
			c.append(targetWord.charAt(i) - 97);
		}

		return Integer.parseInt(c.toString()) == (Integer.parseInt(b.toString()) + Integer.parseInt(a.toString()));
	}

	public static void main(String[] args) {
		System.out.println(isSumEqual("acb", "cba", "cdb"));
	}
}
