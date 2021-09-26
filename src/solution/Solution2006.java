package solution;

public class Solution2006 {

	public static int countKDifference(int[] nums, int k) {
		int[] temp = new int[101];
		int retVal = 0;
		for (int i : nums) {
			temp[i]++;
		}

		for (int i = 1; i < temp.length; i++) {
			if (temp[i] == 0){
				continue;
			}
			if ((i + k) < temp.length && temp[i + k] != 0) {
				retVal = retVal + (temp[i] * temp[i + k]);
			}
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(countKDifference(new int[]{3,2,1,5,4}, 2));
	}
}
