/**
 * @(#)LongestPalindrome.java, 三月 22, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        String res = "";
        int currentLength = 0;
        for (int i = 0, length = s.length(); i < length; i++) {
            if (isPalindrome(s, i - currentLength - 1, i)) {
                res = s.substring(i - currentLength - 1, i + 1);
                currentLength += 2;
            } else if (isPalindrome(s, i - currentLength, i)) {
                res = s.substring(i - currentLength, i +1);
                currentLength += 1;
            }
        }
        return res;
    }

    private boolean isPalindrome(String s, int begin, int end) {
        if (begin < 0) {
            return false;
        }
        while (begin < end) {
            if (s.charAt(begin++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}


