package leetcode.simple;

public class S24 {
    public boolean isPowerOfFour(int num) {
        //循环，题目不能用循环和递归
//        int temp;
//        while (num != 1){
//            temp = num;
//            num = num % 4 ==0 ?num/4:num;
//            if (temp == num){
//                return false;
//            }
//        }
//        return true;

        //数学运算
        return (num > 0) && (Math.log(num) / Math.log(2) % 2 == 0);

        //位运算
    }
}
