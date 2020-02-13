package leetcode.sort;


/**
 * 插入排序
 * 将数据分为两部分，左边为有序的部分，右边为无序部分，从右边无序部分选择一个数，插入有序部分相应的位置中
 */
public class InsertSort {

    public static void sort(int[] nums){
        int len = nums.length;
        //从1开始是因为可以把索引为0的地方当作有序的部分
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
