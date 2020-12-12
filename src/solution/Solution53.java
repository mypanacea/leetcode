package solution;

public class Solution53 {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];

        int res = Integer.MIN_VALUE;
        int temp = 0;

        for(final int i: nums){
            temp = Math.max(temp + i, i);
            res = Math.max(temp, res);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
