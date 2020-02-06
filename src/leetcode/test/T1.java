package leetcode.test;

public class T1 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        int j = 0;
        int n = t.length(); //n = 10000时报错 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 11
        for (int i = 0; i < n; i++){
            if (s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        if (j == s.length()){
            return true;
        }
        return false;
    }
}
