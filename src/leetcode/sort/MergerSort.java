package leetcode.sort;


import java.util.Arrays;

/**
 * 归并排序
 * 核心思想分治法，分治法是将一个问题分解成若干个小问题，将所有小问题求出答案，合并所有小问题的答案就是问题的答案
 * 归并排序是将数组分解成若干个小数组，在进行排序
 */
public class MergerSort {

    public static void sort(int[] nums){
        int len = nums.length;
        int[] tmepArr = new int[len];
        sort(nums,tmepArr,0,len - 1);
    }
    private static void sort(int[] nums,int[] tempArr, int startIndex, int endIndex){
        if (endIndex <= startIndex){
            return;
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        //分解
        sort(nums,tempArr,startIndex,midIndex);
        sort(nums,tempArr,midIndex + 1,endIndex);

        //归并
        merger(nums,tempArr,startIndex,midIndex,endIndex);

    }

    private static void merger(int[] nums, int[] tempArr, int startIndex, int midIndex, int endIndex){
        //复制要归并的数据
        for (int i = startIndex; i <= endIndex; i++){
            tempArr[i] = nums[i];
        }
        //左边首位下标
        int left = startIndex;
        //右边首位下标
        int right = midIndex + 1;
        for (int i = startIndex;i <= endIndex; i++){
            if (left > midIndex){
                //如果左边的首位下标大于中部下表，证明左边的数据已经排完
                nums[i] = tempArr[right++];
            }else if (right > endIndex){
                //如果右边的首位下表大于了数组长度，证明右边的数据已经排完
                nums[i] = tempArr[left++];
            }else if (tempArr[right] < tempArr[left]){
                //将右边的首位排入，然后右边的指针+1
                nums[i] = tempArr[right++];
            }else {
                //将左边的首位排入，然后左边的指针+1
                nums[i] = tempArr[left++];
                //left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,2,3,4,1,8};
        sort(nums);
        for (int num: nums){
            System.out.println(num);
        }
    }

}
