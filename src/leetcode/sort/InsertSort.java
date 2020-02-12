package leetcode.sort;

public class InsertSort {

    public static void sort(int[] nums){
        int len = nums.length;
        for (int i = 1; i < len; i++){
            int value = nums[i];
            int j = i - 1;
            while (j >= 0){
                if (value < nums[j]){
                    nums[j + 1] = nums[j];
                }else {
                    break;
                }
                j--;
            }
            nums[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,2,3,4,1,8};
        sort(nums);
        for (int num: nums){
            System.out.println(num);
        }
    }
}
