package leetcode.simple;

public class S9 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i:nums){
            //异或：任何数和本身异或则为0，任何数和 0 异或是本身
            result  ^= i;
        }
        return result;
    }
}
