package leetcode.simple;

public class S8 {

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        //转换成小写
        s = s.toLowerCase();
        while (start < end){
            //判断字符是否是英文或数字
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
