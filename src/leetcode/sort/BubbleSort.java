package leetcode.sort;

public class BubbleSort {

    public int[] bubbleSort(int[] nums){
        int len = nums.length;
        for (int i =0; i < len; i++){
            int temp;
            for (int j = i; j < len; j++){
                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8,5,6,2,1,3};
        int[] nums1 = new BubbleSort().bubbleSort(nums);
        for (int i : nums1){
            System.out.println(i);
        }
    }
}
