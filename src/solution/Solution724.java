package solution;

public class Solution724 {

    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int index = nums.length - 1;
        while (index >= 0) {
            right = right + nums[index];
            index--;
        }
        index = 0;
        while (index < nums.length) {
            if (left == (right - nums[index])) {
                return index;
            }
            left = left + nums[index];
            right = right - nums[index];
            index++;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 1, 0, -1, -1, 0}));
    }
}
