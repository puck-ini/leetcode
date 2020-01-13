package leetcode.simple;

public class S15 {
    public int hammingWeight(int n) {

        //循环位移
        int bits = 0;
        int mask = 1;
        for (int i =0;i < 32; i++){
            if ((n & mask) != 0){
                bits++;
            }
            mask <<=1;
        }
        return bits;
    }
}
