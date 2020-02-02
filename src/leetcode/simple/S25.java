package leetcode.simple;

import java.util.*;

public class S25 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums1){
            set1.add(num);
        }
        for (int num: nums2){
            set2.add(num);
        }
        int[] num3 = new int[set1.size()];
        int index = 0;
        for (int num: set2){
            if (set1.contains(num)){
                num3[index++] = num;
            }
        }
        return Arrays.copyOf(num3,index);
    }
}
