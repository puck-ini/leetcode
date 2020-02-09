package leetcode.mid;

public class M10 {

    //二分法（log n），看到log n联想到二分法
    //在数组中随便取一个数n，如果n小于start则n右边的数有序，反之左边有序
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len < 1){
            return -1;
        }
        int start = 0;
        int end = len - 1;
        while (start <= end){
            int mid = start + ((end - start) / 2);
            if (nums[mid] == target) {
                return mid;
            }
            //[start,mid]有序
            if (nums[mid] >= nums[start]){
                if (target >= nums[start] && target < nums[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }else {
                //[mid,end]有序
                if (target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
