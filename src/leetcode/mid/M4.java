package leetcode.mid;

public class M4 {
    public int maxArea(int[] height) {
        //1.暴力
//        int currArea = 0;
//        int maxArea = Integer.MIN_VALUE;
//        int len = height.length;
//        for (int i = 0; i < len; i++){
//            for (int j = 0; j < len; j++){
//                currArea = Math.abs(i - j) * Math.min(height[i], height[j]);
//                maxArea = Math.max(maxArea,currArea);
//            }
//        }
//        return maxArea;

        //2.双指针
        int currArea = 0;
        int maxArea = Integer.MIN_VALUE;
        int len = height.length;
        int l = 0;
        int r = len - 1;
        while (l < r){
            currArea = (r - l) * Math.min(height[r], height[l]);
            maxArea = Math.max(maxArea,currArea);
            if (height[r] > height[l]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(new M4().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }


}
