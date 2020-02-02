package leetcode.simple;

public class S23 {
    //将所有非0数前移，index记录下最后的非0数指针，之后把index指针之后的数变成0
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num:nums){
            if (num != 0){
                nums[index++] = num;
            }
        }
        while (index < nums.length){
            nums[index++] =0;
        }
    }
}
