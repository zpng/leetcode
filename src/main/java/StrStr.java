/**
 * @(#)StrStr.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (haystackLength < needleLength) {
            return -1;
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            boolean match = true;
            for (int j = i, k = 0; k < needleLength; j++, k++) {
                if (needle.charAt(k) != haystack.charAt(j)) {
                    match = false;
                }
            }
            if (match) {
                return i;
            }
        }
        return -1;
    }


    //elegant solution from leetcode
    public int strStr2(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

}