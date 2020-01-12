package leetcode.simple;

public class S8 {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end){
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
                continue;
            }
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
