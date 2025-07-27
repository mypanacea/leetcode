package solution;

public class Solution1342 {

	public static int numberOfSteps(int num) {
		int retVal = 0;
		int op = 0;
		while (num != 0) {
			if (num == 1) {
				retVal++;
				break;
			}
			if ((num & 1) == 1) {
				op++;
				retVal++;
			} else {
				retVal++;
			}
			num = num >> 1;
		}

		return retVal + op;
	}

	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));
	}
}
