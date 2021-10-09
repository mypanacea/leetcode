package solution;

import java.util.Arrays;

public class Solution1979 {
	public static int findGCD(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums[nums.length - 1]; i > 0; i--){
			if ((nums[0] % i == 0) && (nums[nums.length - 1] % i == 0)){
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println(findGCD(new int[]{7,5,6,8,3}));
	}
}
