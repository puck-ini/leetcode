package leetcode.mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;



public class M12 {
    //回溯算法
    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;
    private int len;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        this.len = len;
        this.candidates = candidates;
        Arrays.sort(this.candidates);
        backtrace(target, 0, new Stack<>());
        return res;
    }

    private void backtrace(int residue, int start, Stack<Integer> pre) {
        if (residue < 0) {
            return;
        }
        if (residue == 0) {
            res.add(new ArrayList<>(pre));
            return;
        }
        for (int i = start; i < len; i++) {
            if (i > start && candidates[i] == candidates[i - 1]){
                continue;
            }
            pre.add(candidates[i]);
            backtrace(residue - candidates[i], i + 1, pre);
            pre.pop();
        }
    }

}
