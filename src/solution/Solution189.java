package solution;

public class Solution189 {

    public static void main(String[] args) {
        rotate(new int[]{1, 2}, 0);
    }

    public static void rotate(int[] nums, int k) {
        if (nums.length == 1) return;
        int temp[] = new int[k];
        int temp2[] = new int[k];
        for(int i = 0, y = nums.length - 1; i < nums.length; i ++, y--){
            if (i < k){
                temp[i] = nums[i];
                nums[i] = nums[i + (nums.length - k)];
            }else {
                if (i - k < temp.length){
                    temp2[i - k] = nums[i];
                    nums[i] = temp[i-k];
                }else {
                    nums[i] = temp2[temp.length - k];
                }
            }
        }
    }
}
