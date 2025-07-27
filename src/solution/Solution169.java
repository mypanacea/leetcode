package solution;

public class Solution169 {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[]{1, 1, 2, 2, 2, 3}));
	}

	//very low speed solution, faster then 25%
	public static int majorityElement(int[] nums) {
		int count = 0;
		int result = 0;
		for (int i : nums) {
			if (count == 0) {
				result = i;
			}
			if (result == i) {
				count++;
			} else {
				count--;
			}
		}
		return result;
	}
}
