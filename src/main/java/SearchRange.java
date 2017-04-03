/**
 * @(#)SearchRange.java, 四月 03, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[]{-1, -1};
        if (nums.length == 0){
            return result;
        }
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (nums[i] != target) {
            return result;
        } else {
            result[0] = i;
        }

        j = nums.length - 1;
        while (i < j) {
            int mid = (i + j) / 2 + 1;
            if (nums[mid] > target) {
                j = mid - 1;
            } else {
                i = mid;
            }
        }
        result[1] = j;
        return result;
    }
}
