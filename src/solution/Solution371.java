package solution;

public class Solution371 {

	/**
	 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
	 */
	public static int getSum(int a, int b) {
		boolean hasNegateNumber = false;
		if (a < 0 || b < 0) {
			hasNegateNumber = true;
		}
		if ((a < 0) && (Math.abs(a) ^ b) == 0) {
			return 0;
		}
		if ((b < 0) && (Math.abs(b) ^ a) == 0) {
			return 0;
		}
		boolean additionalBit = false;
		int result = 0;
		int position = 0;
		for (int i = 0; i < 32; i++) {
			if ((a & 1) == 1 && (b & 1) == 1) {
				if (additionalBit) {
					result = result | (1 << position);
				} else {
					additionalBit = true;
				}
				position++;
			} else if ((a & 1) == 1 || (b & 1) == 1) {
				if (!additionalBit) {
					result = result | (1 << position);
				}
				position++;
			} else {
				if (additionalBit) {
					result = result | (1 << position);
					additionalBit = false;
				}
				position++;
			}
			a >>= 1;
			b >>= 1;
		}
		if (additionalBit && !hasNegateNumber) {
			result = result | (1 << position);
		}

		return result;
	}

	public static void main(String[] args) {
		getSum(-14, 16);
	}
}
