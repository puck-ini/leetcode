package leetcode.simple;

public class S13 {

    //投票算法
    public int majorityElement(int[] nums) {
        //1.暴力解决
        int len = nums.length;
        int majority = len/2;
        for(int i:nums){
            int count = 0;
            for (int j:nums){
                if (i == j){
                   count++;
                }
            }
            if (count > majority){
                return i;
            }
        }
        return Integer.MIN_VALUE;

        //2.hashmap

    }
}
