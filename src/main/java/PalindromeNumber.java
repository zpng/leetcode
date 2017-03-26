/**
 * @(#)PalindromeNumber.java, 三月 26, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0) && x % 10 == 0) {
            return false;
        }
        int rev = 0;
        while (x > rev){
            rev = rev * 10 + x % 10;
            x = x /10;
        }
        return (x == rev) || (x == rev /10);
    }
}
