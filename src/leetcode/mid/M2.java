package leetcode.mid;

import java.util.HashSet;
import java.util.Set;

public class M2 {
    //滑动窗口
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int result = 0, i =0 , j =0;
        while (i < n && j < n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                result = Math.max(result,j - i);
            }else {
                set.remove(s.charAt(i++));
            }
        }
        return result;
    }
}
