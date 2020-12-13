package solution;

public class Solution674 {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int retVal = 0;
        int temp = 0;
        for(int i = 1; i < nums.length; i ++){
            if(nums[i] > nums[i-1]){
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
        System.out.println(findLengthOfLCIS(new int[]{1,3,5,7}));
    }
}
