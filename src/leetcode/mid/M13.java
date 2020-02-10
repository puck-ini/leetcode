package leetcode.mid;

import java.util.*;


public class M13 {

    //TODO
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> nums1 = new ArrayList<>();
        int len = nums.length;
        for (int num: nums){
            nums1.add(num);
        }
        backtrack(len, nums1, lists,0);
        return lists;
    }

    private void backtrack(int len, List<Integer> nums, List<List<Integer>> lists, int start){
        if (start == len){
            lists.add(new ArrayList<>(nums));
        }
        for (int i = start; i < len; i++){
            Collections.swap(nums, start, i);
            //
            backtrack(len,nums,lists,start + 1);
            Collections.swap(nums, start, i);
        }
    }

    public static void main(String[] args) {
         new M13().permute(new int[]{1,2,3});
    }
}
