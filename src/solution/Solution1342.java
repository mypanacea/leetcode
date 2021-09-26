package solution;

public class Solution1342 {

	public static int numberOfSteps(int num) {
		int retVal = 0;
		while (num != 0) {
			if ((num ^ 1) != num + 1) {
				num--;
				retVal++;
			}
			if (num == 0) {
				continue;
			}
			num = num >> 1;
			retVal++;
		}

		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(numberOfSteps(8));
	}
}
