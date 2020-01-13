package leetcode.simple;

public class S16 {
    public int rob(int[] nums) {
        //动态规划 2,7,9,3,1
        /**    2,7,9,3,1
         * 0 0
         * 0 0 2 7
         * 0 0 2 7 11
         * 0 0 2 7 11 11
         * 0 0 2 7 11 11 12
         */
        int len = nums.length;
        int[] dp = new int[len + 2];
        for (int i = 0; i < len; i++){
            dp[i + 2] = Math.max(dp[i + 1], nums[i] + dp[i]);
        }
        return dp[len + 1];
    }
}
