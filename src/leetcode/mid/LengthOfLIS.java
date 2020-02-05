package leetcode.mid;

import java.util.Arrays;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        int[] dp = new int[len];
        int max = 0;
        Arrays.fill(dp ,1);
        for (int i = 0; i< len; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
