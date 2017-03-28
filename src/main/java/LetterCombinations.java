/**
 * @(#)LetterCombinations.java, 三月 28, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.LinkedList;
import java.util.List;

/**
 * @author ldap
 */
public class LetterCombinations {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<String>();
        if (digits.isEmpty()) {
            return result;
        }
        String[] map =
                new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while (result.peek().length() == i) {
                String t = result.remove();
                for (char s : map[x].toCharArray()) {
                    result.add(t + s);
                }
            }
        }
        return result;
    }
}
