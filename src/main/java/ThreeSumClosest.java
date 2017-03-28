/**
 * @(#)ThreeSumClosest.java, 三月 28, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import java.util.Arrays;

/**
 * @author ldap
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;

    }
}
