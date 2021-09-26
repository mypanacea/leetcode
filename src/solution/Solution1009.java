package solution;

public class Solution1009 {

	public static int bitwiseComplement(int n) {
		if (n == 0){
			return 1;
		}
		int temp = 1;
		int retVal = n;
		while (n > 0){
			retVal = retVal ^ temp;
			temp <<= 1;
			n >>= 1;
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(bitwiseComplement(5));
	}
}
