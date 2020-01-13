package leetcode.simple;

public class S11 {

    public int[] twoSum(int[] numbers, int target) {
        //1.暴力破解
//        int len = numbers.length;
//        for (int i = 0; i < len; i++){
//            if (numbers[i] <= target){
//                for (int j = i + 1; j < len; j++){
//                    if (numbers[j] == (target - numbers[i]) ){
//                        return new int[]{i+1,j+1};
//                    }
//                }
//            }
//        }
//        return new int[] {0,0};
        //2.双指针
        int len = numbers.length;
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end){
            int result = numbers[start] + numbers[end];
            if (result > target){
                end--;
            }
            if (result < target){
                start++;
            }
            if ((numbers[start] + numbers[end]) == target){
                return new int[]{start + 1,end + 1};
            }
        }
        return null;
    }
}
