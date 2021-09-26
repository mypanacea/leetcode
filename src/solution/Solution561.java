package solution;

import java.util.Arrays;

public class Solution561 {

	public static int arrayPairSum(int[] nums) {
		int retVal = 0;
		Arrays.sort(nums);
		for (int i = nums.length; i != 0; i = i - 2) {
			retVal += nums[i - 2];
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));
	}
}
