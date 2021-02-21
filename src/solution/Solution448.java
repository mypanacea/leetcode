package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		if(nums.length == 0){
			return Collections.emptyList();
		}
		int lastKey = nums.length;
		List<Integer> retVal = new ArrayList<>();
		for (final int num : nums) {
			lastKey = Math.max(lastKey, num);
		}
		int[] temp = new int[lastKey + 1];
		for (final int num : nums) {
			temp[num]++;
		}
		for (int i = 1; i < temp.length; i++) {
			if (temp[i] == 0) {
				retVal.add(i);
			}
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
	}
}
