package leetcode.simple;

public class S27 {
    public int getSum(int a, int b) {
//        while (b != 0){
//            int temp = a ^ b;
//            b = (a & b) << 1;
//            a = temp;
//        }
//        return a;
        if (a == 0){ return b;}
        if (b == 0) {return a;}
        return getSum(a ^ b,(a & b) << 1);

    }
}
