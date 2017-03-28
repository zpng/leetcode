/**
 * @(#)ContainerWithMostWater.java, 三月 28, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left=0, right= height.length -1;
        int maxArea = 0;
        while (left < right){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}