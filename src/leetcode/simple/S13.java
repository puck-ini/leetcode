package leetcode.simple;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class S13 {

    //投票算法
    public int majorityElement(int[] nums) {
        //1.暴力解决
//        int len = nums.length;
//        int majority = len/2;
//        for(int i:nums){
//            int count = 0;
//            for (int j:nums){
//                if (i == j){
//                   count++;
//                }
//            }
//            if (count > majority){
//                return i;
//            }
//        }
//        return Integer.MIN_VALUE;

        //2.hashmap，通过hashmap保存所有数以及出现次数
//        Map<Integer,Integer> counts = countNum(nums);
//        Map.Entry<Integer,Integer> entry = null;
//        for (Map.Entry<Integer,Integer> entry1: counts.entrySet()){
//            if (entry == null || entry1.getValue() > entry.getValue()){
//                entry = entry1;
//            }
//        }
//        return entry.getKey();
        //3.排序
//        Arrays.sort(nums);
//        return nums[nums.length/2];

        //4.投票算法
        int count = 0;
        int candidate  = Integer.MIN_VALUE;
        for (int num: nums){
            if (count == 0){
                candidate = num;
            }
            count += (candidate == num)? 1 : -1;
        }
        return candidate;
        //5.分治法//TODO
    }


    //2.hashmap保存所有数以及出现次数
    private Map<Integer,Integer> countNum(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num) + 1);
            }
        }
        return map;
    }
}
