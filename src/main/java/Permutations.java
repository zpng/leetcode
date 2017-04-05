/**
 * @(#)Permutations.java, 四月 05, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldap
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        backtrack(results, new ArrayList<Integer>(), nums);
        return results;
    }

    private void backtrack(List<List<Integer>> results, ArrayList<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            results.add(new ArrayList<Integer>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i]))
                    continue;
                tempList.add(nums[i]);
                backtrack(results, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
