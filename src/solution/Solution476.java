package solution;

import java.util.Arrays;

public class Solution476 {
	public static int findComplement(int num) {
		int[] arr = new int[32];
		Arrays.fill(arr, 9);
		int j = 0;
		while (num != 0) {
			arr[j] = (num & 1) ^ 1;
			num = num >>1;
			j++;
		}
		int retVal = 0;
		for (int i = 0; i < 31; i++) {
			if (arr[i] == 1){
				retVal = retVal + (int) Math.pow(2, i);
			}
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(findComplement(1));
	}
}
