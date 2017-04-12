/**
 * @(#)StringEqualsTest.java, 四月 12, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ldap
 */
public class StringEqualsTest {

    @Test
    public void testEquals() {
        String s1 = "hello";
        String s2 = "hello";
        assertEquals(true, s1 == s2);
        assertEquals(true, s1.equals(s2));
    }
}
