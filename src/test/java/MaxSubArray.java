/**
 * @(#)MaxSubArray.java, 四月 11, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        int max = sum[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum[i - 1] < 0) {
                sum[i] = nums[i];
            } else {
                sum[i] = sum[i - 1] + nums[i];
            }
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        return max;
    }
}