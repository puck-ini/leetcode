package leetcode.simple;

public class S6 {

    //[7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        if (prices.length == 0){
            return 0;
        }
        int result = Integer.MIN_VALUE;
        int buy = prices[0];
        int profit = Integer.MIN_VALUE;
        int len = prices.length;
        for (int i = 0; i < len; i++){
            if (buy > prices[i]){
                buy = prices[i];
            }else {
                profit = prices[i] - buy;
                result = Math.max(profit,result);
            }
        }
        return result;
    }
}
