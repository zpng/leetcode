/**
 * @(#)GetPermutation.java, 四月 11, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangpeng
 */
public class GetPermutation {

    public String getPermutation(int n, int k) {

        List<Integer> nums = new ArrayList<Integer>();
        int[] factorial = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        k--;
        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            sb.append(String.valueOf(nums.get(index)));
            nums.remove(index);
            k -= index * factorial[n - i];
        }
        return sb.toString();
    }
}