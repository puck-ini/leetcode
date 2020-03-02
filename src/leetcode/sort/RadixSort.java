package leetcode.sort;

import java.util.ArrayList;

public class RadixSort {

    public static void radixSort(int[] nums){
        int len = nums.length;

        //最大值
        int max = nums[0];
        for (int i = 0; i < len; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }

        //当前排序位置
        int location = 1;

        //桶排序
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<>();

        //长度为10装入余数0-9的数据
        for (int i = 0; i < 10; i++){
            bucketList.add(new ArrayList<>());
        }

        while (true){
            int dd = (int)Math.pow(10,(location - 1));
            if (max < dd){
                break;
            }

            //数据入桶
            for (int i = 0; i < len; i++){
                //计算余数放入相应的桶
                int number = ((nums[i] / dd) % 10);
                bucketList.get(number).add(nums[i]);
            }
            //写回数组
            int nn = 0;
            for (int i = 0; i < 10;i++){
                int size = bucketList.get(i).size();
                for (int j = 0; j < size; j++){
                    nums[nn++] = bucketList.get(i).get(j);
                }
                bucketList.get(i).clear();
            }
            location++;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,6,8,2,1,4,3,7,5,5};
        radixSort(nums);
        for (int num : nums){
            System.out.println(num);
        }
    }
}
