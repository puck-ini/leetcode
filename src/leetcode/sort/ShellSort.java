package leetcode.sort;

/**
 * 希尔排序
 * TODO
 */
public class ShellSort {

    public static void sort(int[] nums){
        int len = nums.length;
        //区间
        int gap = 1;
        while (gap < len){
            gap = gap * 3 + 1;
        }
        while (gap > 0){
            for (int i = gap; i < len; i++){
                int temp = nums[i];
                int j = i - gap;
                //跨区间排序
                while (j >= 0 && nums[j] > temp){
                    nums[j + gap] = nums[j];
                    j -= gap;
                }
                nums[j + gap] = temp;
            }
            gap = gap / 3;
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
