/**
 * @(#)CombinationSumII.java, 四月 05, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangpeng
 */
public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(result, candidates, new ArrayList<Integer>(), target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] candidates, ArrayList<Integer> tempList, int remain, int
            start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            result.add(new ArrayList<Integer>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i-1]) continue;// 区别
                tempList.add(candidates[i]);
                backtrack(result, candidates, tempList, remain - candidates[i], i + 1);//i i+1 与 CombinationSum的区别
                tempList.remove(tempList.size() - 1);
            }
        }

    }
}