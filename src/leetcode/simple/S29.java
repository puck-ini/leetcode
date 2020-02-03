package leetcode.simple;

import java.util.HashSet;
import java.util.Set;

public class S29 {
    //糖果是偶数，当糖果种类大于n/2时，因为时坪分，因此获得糖果数为n/2，当糖果种类小于n/2时为糖果种类
    //因此只需要知道糖果种类有多少
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i: candies){
            set.add(i);
        }
        return Math.min(set.size(),candies.length / 2);
    }
}
