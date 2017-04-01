/**
 * @(#)RemoveDuplicates.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2){
            return length;
        }
        int i = 1;
        for (int j = 1; j < length; j++) {
            if (nums[j] != nums[j-1]){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}