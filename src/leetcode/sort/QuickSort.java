package leetcode.sort;


/**
 * 快速排序
 * 快速排序核心思想于归并一样都是分治法
 * 选择一个基准值，将小于基准值的数放在基准值左边，大于基准值的数放在右边，然后右边以及左边重复上述步骤，直到最后
 */
public class QuickSort {

    public static void sort(int[] nums){
        sort(nums,0,nums.length - 1);
    }

    private static void sort(int[] nums,int startIndex, int endIndex){
        if (startIndex > endIndex){
            return;
        }
        int left = startIndex;
        int right = endIndex;
        int pivot = nums[startIndex];

        while (left < right){
            while (pivot >= nums[left] && left < right){
                left++;
            }

            while (pivot < nums[right] && left < right){
                right--;
            }
            if (left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        nums[startIndex] = nums[left];
        nums[left] = pivot;

        sort(nums,startIndex, right - 1);
        sort(nums, right + 1,endIndex);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,2,3,4,1,8};
        sort(nums);
        for (int num: nums){
            System.out.println(num);
        }
    }
}
