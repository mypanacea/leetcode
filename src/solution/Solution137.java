package solution;

public class Solution137 {

	public static int singleNumber(int[] arr) {
		int s1 = 0;
		int s2 = 0;
		for (int num : arr) {
			s1 = s1 ^ num & ~s2;
			s2 = s2 ^ num & ~s1;
		}
		return s1;
	}

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{1, 2, 2, 2, 3, 3, 3}));
	}
}
