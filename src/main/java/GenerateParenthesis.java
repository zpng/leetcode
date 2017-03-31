/**
 * @(#)GenerateParenthesis.java, 三月 31, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangpeng
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {

        List<String> results = new LinkedList<String>();

        backTrack(results, "", 0, 0, n);
        return results;
    }

    private void backTrack(List<String> results, String s, int open, int close, int max) {

        if (s.length() == max * 2) {
            results.add(s);
        }

        if (open < max) {
            backTrack(results, s + "(", open + 1, close, max);
        }
        if (close < open) {
            backTrack(results, s + ")", open, close + 1, max);
        }
    }
}