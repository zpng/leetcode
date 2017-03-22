/**
 * @(#)FindMedianSortedArrays.java, 三月 22, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0;
        int iMax = m;
        int i = 0, j = 0;
        int maxLeft, minRight;
        while (iMin <= iMax) {
            i = (iMin + iMax) / 2;
            j = (m + n + 1) / 2 - i;
            if (i > 0 && nums1[i - 1] > nums2[j] ) {
                iMax = i - 1;
            } else if (i<m && nums2[j - 1] > nums1[i]) {
                iMin = i + 1;
            } else {
                break;
            }
        }
        if (i == 0) {
            maxLeft = nums2[j - 1];
        } else if (j == 0) {
            maxLeft = nums1[i - 1];
        } else {
            maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
        }

        if ((m + n) % 2 == 1) {
            return maxLeft;
        }

        if (i == m) {
            minRight = nums2[j];
        } else if (j == n) {
            minRight = nums1[i];
        } else {
            minRight = Math.min(nums1[i], nums2[j]);
        }
        return (maxLeft + minRight) / 2.0;

    }
}

