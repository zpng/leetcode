/**
 * @(#)CombinationSum.java, 四月 05, 2017.
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
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(result, candidates, new ArrayList<Integer>(), target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] candidates, ArrayList<Integer> tempList, int remain, int
            start) {
        if (remain < 0){
            return;
        }else if(remain == 0){
            result.add(new ArrayList<Integer>(tempList));
        }else {
            for (int i = start;i< candidates.length;i++){
                tempList.add(candidates[i]);
                backtrack(result, candidates, tempList, remain - candidates[i], i);
                tempList.remove(tempList.size() -1);
            }
        }

    }
}