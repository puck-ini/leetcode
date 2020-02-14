package leetcode.search;

public class BinarySearch {

    public static int binarySearch(int[] nums, int data){
        int min = 0;
        int max = nums.length - 1;
        int mid;
        while (min <= max){
            //这种写法可以防止溢出， (max + mid) / 2 可能会溢出
            //官方使用位运算，min + ((max - min) >>> 2); 用括号括起来是因为位运算优先级较低
            mid = min + (max - min) / 2;
            if (nums[mid] > data){
                max = mid - 1 ;
            }else if (nums[mid] < data){
                min = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(nums,5));
    }
}
