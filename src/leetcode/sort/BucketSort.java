package leetcode.sort;

import java.util.ArrayList;

public class BucketSort {

    public static void main(String[] args) {
        int[] nums = new int[]{8,5,6,3,1,2,2,2,4};
        bucketSort(nums);
        for (int num: nums){
            System.out.println(num);
        }
    }

    public static void bucketSort(int[] nums){
        //最大最小值
        int max = nums[0];
        int min = nums[0];
        int len = nums.length;

        for (int i = 1; i < len; i++){
            if (nums[i] > max){
                max = nums[i];
            }else if (nums[i] < min){
                min = nums[i];
            }
        }
        //最大值和最小值的差
        int diff = max - min;
        //桶列表
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i < len; i++){
            bucketList.add(new ArrayList<>());
        }
        //每个桶的存数区间
        float section = (float) diff / (float)(len - 1);
        //数据入桶
        for (int i = 0; i < len; i++){
            //当前数除以区间得出存放桶的位置 减1后得出桶的下标
            int num = (int) (nums[i] / section) - 1;
            if (num < 0){
                num = 0;
            }
            bucketList.get(num).add(nums[i]);
        }
        //桶内排序
        int index = 0;
        for (ArrayList<Integer> arrayList: bucketList){
            for (int value: arrayList){
                nums[index] = value;
                index++;
            }
        }
    }
}
