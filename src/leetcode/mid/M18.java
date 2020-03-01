package leetcode.mid;

public class M18 {

//    public boolean canJump(int[] nums) {
//        int k = 0;
//        for(int i = 0; i < nums.length; i ++){
//            //判断数组中出现的0，如果出现0之前还没能返回true 则说明数组后面的数都跳不到，因此返回false
//            if (i > k){
//                return false;
//            }
//            //k能为跳到的最远距离
//            k = Math.max(k, i + nums[i]);
//            if (k > nums.length){
//                return true;
//            }
//        }
//        return true;
//    }

    //回溯
    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                return true;
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }


    public static void main(String[] args) {
        M18 m18 = new M18();
        System.out.println(m18.canJump(new int[]{3,2,1,0,4}));
    }
}
