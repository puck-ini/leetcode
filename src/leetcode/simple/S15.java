package leetcode.simple;

public class S15 {
    public int hammingWeight(int n) {

        //1.循环位移
//        int bits = 0;
//        int mask = 1;
//        for (int i =0;i < 32; i++){
//            if ((n & mask) != 0){
//                bits++;
//            }
//            mask <<=1;
//        }
//        return bits;

        //2.
        /** n = 110
         *  110&101=100   ++
         *  100&011=0     ++
         *  return 2
         */
        int sum = 0;
        while (n!=0){
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
