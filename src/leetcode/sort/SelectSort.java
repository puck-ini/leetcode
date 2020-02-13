package leetcode.sort;


/**
 * 选择排序
 * 从数组中选择最小的数插入数组最前端
 */
public class SelectSort {

    public static void  sort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len; i++){
            int min = i;
            for (int j = i; j < len; j++){
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
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
