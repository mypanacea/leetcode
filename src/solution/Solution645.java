package solution;

public class Solution645 {

    public static int[] findErrorNums(int[] nums) {
        int dup = 0;
        int miss = 0;
        int temp[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++ ){
            temp[nums[i]] = ++temp[nums[i]];
        }
        for (int i = 0; i < temp.length; i ++){
            if (temp[i] == 0){
                miss = i;
            }
            if (temp[i] > 1){
                dup = i;
            }
        }

        return new int[]{dup, miss};
    }

    public static void main(String[] args) {
        System.out.println(findErrorNums(new int[]{1,2,2,4})[0]);
        System.out.println(findErrorNums(new int[]{1,2,2,4})[1]);
    }
}
