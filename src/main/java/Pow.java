/**
 * @(#)Pow.java, 四月 11, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class Pow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n = n + 1;
                n = -n;
                x = 1 / x;
                return x * x * myPow(x * x, n / 2);
            } else {
                n = -n;
                x = 1 / x;
            }
        }
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}