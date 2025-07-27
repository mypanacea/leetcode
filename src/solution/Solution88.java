package solution;

public class Solution88 {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0 && n > 0) {
			System.arraycopy(nums2, 0, nums1, 0, n);
		}
		int tempM = m - 1;
		int tempN = n - 1;
		for (int i = nums1.length - 1; i >= 0; i--) {
			if (tempN < 0) {
				break;
			}
			if (tempM < 0) {
				System.arraycopy(nums2, 0, nums1, 0, tempN + 1);
				continue;
			}
			if (nums1[tempM] > nums2[tempN]) {
				nums1[i] = nums1[tempM];
				tempM--;
			} else {
				nums1[i] = nums2[tempN];
				tempN--;
			}
		}
	}

	public static void main(String[] args) {
		merge(new int[]{2, 0}, 1, new int[]{1}, 1);
	}
}
