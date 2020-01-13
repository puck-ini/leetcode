package leetcode.simple;

public class S12 {


    /**计算0的个数，一个数乘10位数才会有0出现，而10可以分解为2*5，
     * 在阶乘中2的个数比5多，因此只需计算5的个数即可
     */
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0){
            count += n/5;
            n /=5;
        }
        return count;
    }
}
