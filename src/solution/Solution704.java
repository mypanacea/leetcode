package solution;

import java.math.BigDecimal;
import java.util.Arrays;

public class Solution704 {

    private static int lvl;

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int middle = (left + right)/2;
            if (nums[middle] == target){
                return middle;
            }
            if (nums[middle] > target){
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new BigDecimal("1.0"));
        System.out.println(new BigDecimal("1.00"));
        System.out.println(new BigDecimal("1.0").equals(new BigDecimal("1.00")));
        System.out.println(new BigDecimal("1.0").compareTo(new BigDecimal("1.00")));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 3));
    }
}
