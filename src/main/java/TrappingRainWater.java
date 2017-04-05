/**
 * @(#)TrappingRainWater.java, 四月 05, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class TrappingRainWater {

    public int trap(int[] height) {

        int a = 0;
        int b = height.length - 1;
        int max = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (a <= b) {
            leftMax = Math.max(leftMax, height[a]);
            rightMax = Math.max(rightMax, height[b]);
            if (leftMax < rightMax) {
                max += (leftMax - height[a]);
                a++;
            } else {
                max += (rightMax - height[b]);
                b--;
            }
        }
        return max;

    }
}