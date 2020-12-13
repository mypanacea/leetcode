package solution;

/**
 * Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).
 * The subsequence must be strictly increasing.
 * <p>
 * A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ...,
 * nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
 * <p>
 * [RUS] найти наибольшую длину последовательности возрастающих чисел в массиве
 */
public class Solution674 {

    /**
     * Быстрее чем 99% решений
     */
    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int retVal = 0;
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp++;
            } else {
                retVal = Math.max(retVal, temp);
                temp = 0;
            }
            retVal = Math.max(retVal, temp);
        }

        return retVal + 1;
    }

    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 7}));
    }
}
