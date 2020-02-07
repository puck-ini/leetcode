package leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M5 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;
        if (len < 3){
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len; i++){
            //排序过后，如果nums[i] > 0，与之后的任意两数相加都不可能等于0
            if (nums[i] > 0){
                break;
            }
            //去重
            if (i > 0 && nums[i] == nums[i -1]){
                continue;
            }
            int L = i + 1;
            int R = len - 1;
            while (L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0){
                    lists.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 去重
                    while (L<R && nums[L] == nums[L+1]){
                        L++;
                    }
                    while (L<R && nums[R] == nums[R-1]){
                        R--;
                    }

                    L++;
                    R--;
                }else if (sum < 0){
                    L++;
                }else if (sum > 0){
                    R--;
                }
            }
        }
        return lists;
    }
}
