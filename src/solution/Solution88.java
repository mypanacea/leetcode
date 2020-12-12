package solution;

public class Solution88 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        for (int i = 0; i < n; i ++){
            if (nums2[n -1 - i] > nums1[m - 1 - temp]){
                nums1[m + n - 1 - i] = nums2[n -1 - i];
            }else {
                nums1[m + n - 1 - i] = nums1[m - 1 - temp];
                nums1[m - 1 - temp] = nums2[n -1 - i];
                temp++;
            }
        }
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
