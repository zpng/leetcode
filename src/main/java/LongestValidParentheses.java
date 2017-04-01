/**
 * @(#)LongestValidParentheses.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.Stack;

/**
 * @author zhangpeng
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int left = -1;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                if (stack.isEmpty()) {
                    left = i;
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        max = Math.max(max, i - left);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }
                }
            }
        }
        return max;
    }


    //方法2,  动态规划   f(i) 为以 i 为结束的最长 parenthsis 长度.
}