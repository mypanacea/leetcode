package solution;

public class Solution1009 {

	public static int bitwiseComplement(int n) {
		if (n == 0) {
			return 1;
		}
		int retVal = 0;
		for (int i = 0; n != 0; i++) {
			int bit = (n & 1) ^ 1;
			if (bit == 1) {
				retVal = retVal + (int) Math.pow(2, i);
			}
			n = n >> 1;
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(bitwiseComplement(10));
	}
}
