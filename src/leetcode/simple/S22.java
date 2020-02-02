package leetcode.simple;

public class S22 {

    public boolean isUgly(int num) {
        int temp;
        while (num != 1){
            temp = num;
            num = num % 2 == 0 ? num/2:num;
            num = num % 3 == 0 ? num/3:num;
            num = num % 5 == 0 ? num/5:num;
            if (temp == num){
                return false;
            }
        }
        return true;
    }
}
