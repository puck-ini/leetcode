package leetcode.simple;

public class S4 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int current = m + n -1;
        while(current >= 0){
            if (n == 0){
                return;
            }
            if (m < 1){
                nums1[current--] = nums2[--n];
                continue;
            }
            if (n < 1){
                nums1[current--] = nums2[--m];
                continue;
            }
            if (nums1[m - 1] > nums2[n - 1]){
                nums1[current--] = nums1[--m];
            }else {
                nums1[current--] = nums2[--n];
            }
        }
    }
}
