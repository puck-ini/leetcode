package leetcode.mid;

public class M4 {
    public int maxArea(int[] height) {
        int currArea = 0;
        int maxArea = Integer.MIN_VALUE;
        int len = height.length;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                currArea = Math.abs(i - j) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea,currArea);
            }
        }
        return maxArea;
    }
}
