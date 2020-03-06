package leetcode.sort;


/**
 * 冒泡排序
 * 数组中两个数比较，大的往后移小的往前移，小的轻，类似于气泡向上冒
 */
public class BubbleSort {

    public int[] bubbleSort(int[] nums){
        int len = nums.length;
        for (int i =0; i < len; i++){
            int temp;
            for (int j = 0; j < len - i - 1; j++){
                if (nums[j] > nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8,5,6,2,2,1,3};
        int[] nums1 = new BubbleSort().bubbleSort(nums);
        for (int i : nums1){
            System.out.println(i);
        }
    }
}
