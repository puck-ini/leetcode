package leetcode.sort;

public class CountSort {

    public static void main(String[] args) {
        int[] nums = new int[]{8,5,6,3,1,2,2,2,4};
        countSort(nums);
        for (int num: nums){
            System.out.println(num);
        }
    }

    public static void countSort(int[] nums){
        int max = nums[0];
        int len = nums.length;
        //找出数组最大值
        for (int i = 0; i < len; i++){
            max = Math.max(max,nums[i]);
        }
        //初始化计数数组
        int[] countArray = new int[max + 1];

        //计数
        for (int i = 0; i < len; i++){
            countArray[nums[i]]++;
            nums[i] = 0;
        }
        //排序
        int index = 0;
        for (int i = 0; i < countArray.length; i++){
            if (countArray[i] > 0){
                nums[index++] = i;
                //如果有重复数据需要重复判断
                countArray[i]--;
                i--;
            }
        }
    }
}
