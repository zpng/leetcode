/**
 * @(#)LengthOfLastWord.java, 四月 12, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int cnt = 0;
        boolean start = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && start == true) {
                break;
            } else if (s.charAt(i) != ' ') {
                start = true;
                cnt++;
            }
        }
        return cnt;
    }

    public int lengthOfLastWord2(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
