/**
 * @(#)MergeTwoLists.java, 三月 31, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author zhangpeng
 */
public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            ListNode mergeHead;
            if (l1.val < l2.val) {
                mergeHead = l1;
                mergeHead.next = mergeTwoLists(l1.next, l2);
            } else {
                mergeHead = l2;
                mergeHead.next = mergeTwoLists(l1, l2.next);
            }
            return mergeHead;
        }

    }
}