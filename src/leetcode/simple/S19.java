package leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 使用hashmap保存出现过的值
 */
public class S19 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //hashmap or hashset
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
