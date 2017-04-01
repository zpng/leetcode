/**
 * @(#)SubstringWithConcatenationOfAllWords.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangpeng
 */
public class SubstringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        if (s == null || words == null || words.length == 0) {
            return res;
        }
        int length = words[0].length();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
        }

        for (int i = 0; i <= s.length() - words.length * length; i++) {
            Map<String, Integer> copy = new HashMap<String, Integer>(map);
            for (int j = 0; j < words.length; j++) {
                String str = s.substring(i + j * length, i + j * length + length);
                if (copy.containsKey(str)) {
                    int count = copy.get(str);
                    if (count == 1) {
                        copy.remove(str);
                    } else {
                        copy.put(str, count - 1);
                    }
                    if (copy.isEmpty()) {
                        res.add(i);
                        break;
                    }
                } else break;
            }
        }
        return res;
    }
}