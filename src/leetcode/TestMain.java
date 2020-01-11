package leetcode;

import leetcode.simple.S1;
import leetcode.simple.S2;

public class TestMain {

    public static void main(String[] args) {
//        S1 s1 = new S1();
//        String s = "({asasdsadasa}";
//        System.out.println(s1.isValid(s));
        S2 s2 = new S2();
        int[] nums = {1,1,1,1,2,2,3};
        System.out.println(s2.removeDuplicates(nums));
    }
}
