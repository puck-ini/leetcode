package leetcode.simple;

public class S14 {
    // you need treat n as an unsigned value
    //TODO 没看懂
    public int reverseBits(int n) {
        int res = 0;
        int count = 0;
        while (count < 32) {
            //res 左移一位空出位置
            res <<= 1;
            //得到的最低位加过来
            res |= (n & 1);
            //原数字右移一位去掉已经处理过的最低位
            n >>= 1;
            count++;
        }
        return res;
    }
}
