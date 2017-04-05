/**
 * @(#)JumpGameII.java, 四月 05, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class JumpGameII {

    public int jump(int[] A) {
        int sc = 0;
        int e = 0;
        int max = 0;
        for (int i = 0; i < A.length - 1; i++) {
            max = Math.max(max, i + A[i]);
            if (i == e) {
                sc++;
                e = max;
            }
        }
        return sc;
    }

/*    Very elegant method, but it took me a long time to understand. Some comment for the above:

    e: longest distance in current minimum step

    sc: minimum steps for reaching e

    From i to e, even max is changed in a loop, it is reachable in one step.

    Help it will help : )*/

    //仍然没看懂
}