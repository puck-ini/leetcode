package leetcode.simple;

public class S3 {
    public int maxSubArray(int[] nums) {
//        //1. 暴力
//        int len = nums.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for (int i =0; i < len; i++){
//            sum=0;
//            for (int j = i; j < len; j++){
//                sum += nums[j];
//                max = Math.max(max,sum);
//            }
//        }
//        return max;
////        2. 动态规划
//        int len = nums.length;
//        int dp = nums[0];
//        int result = dp;
//        for (int i = 1; i < len;i++){
//            dp = Math.max(dp + nums[i],nums[i]);
//            result = Math.max(result,dp);
//        }
//        return result;
////        2. 动态规划 数组
//        int len = nums.length;
//        int[] dp = new int[len];
//        int result = Integer.MIN_VALUE;
//        for (int i = 1; i < len;i++){
//            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
//            result = Math.max(result,dp[i]);
//        }
//        return result;

        //3. 贪心法
        int len = nums.length;
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (int n:nums){
            sum += n;
            result = Math.max(sum,result);
            if (sum < 0){
                sum = 0;
            }
        }
        return result;
        //4. 分治法
    }
}
