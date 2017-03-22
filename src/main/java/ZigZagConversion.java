/**
 * @(#)ZigZagConversion.java, 三月 22, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
        int i = 0;
        while (i < length){
            //vertical
            for (int idx = 0; idx < numRows && i < length; idx++){
                sb[idx].append(charArray[i++]);
            }
            //oblique
            for (int idx = numRows -2; idx >=1 && i< length; idx--){
                sb[idx].append(charArray[i++]);
            }
        }
        for (int idx = 1; idx < numRows ; idx++){
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}
