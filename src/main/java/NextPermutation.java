/**
 * @(#)NextPermutation.java, 四月 01, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        if (n < 2) {
            return;
        }
        int index = n - 1;
        while (index > 0) {
            if (nums[index - 1] < nums[index]) {
                break;
            }
            index--;
        }
        if (index == 0) {
            reverseSort(nums, 0, n - 1);
        } else {
            int val = nums[index - 1];
            int j = n - 1;
            while (j >= index) {
                if (nums[j] > val) break;
                j--;
            }
            swap(nums, j, index - 1);
            reverseSort(nums, index, n - 1);
            return;
        }
    }

    private void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverseSort(int[] nums, int start, int end) {

        if (start > end) {
            return;
        }

        for (int i = start; i <= (start + end) / 2; i++) {
            swap(nums, i, start + end - i);
        }
    }
}