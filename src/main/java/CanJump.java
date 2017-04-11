/**
 * @(#)CanJump.java, 四月 11, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class CanJump {

    public boolean canJump(int[] nums) {

        if (nums == null || nums.length == 0) {
            return true;
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i <= max) {
                if (i + nums[i] > max) {
                    max = i + nums[i];
                }
                if (max >= nums.length - 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }


    public boolean canJump2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}


