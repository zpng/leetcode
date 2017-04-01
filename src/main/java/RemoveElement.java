/**
 * @(#)RemoveElement.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int begin = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[begin++] = nums[j];
            }
        }
        return begin;
    }
}