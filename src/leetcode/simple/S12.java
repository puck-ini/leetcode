package leetcode.simple;

public class S12 {


    //只需计算5的个数即可
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0){
            count += n/5;
            n /=5;
        }
        return count;
    }
}
