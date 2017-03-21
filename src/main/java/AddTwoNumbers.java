/**
 * @(#)AddTwoNumbers.java, 三月 21, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author ldap
 */


public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int carry = 0;
        while (l1!= null || l2!= null || carry !=0) {
            int sum = (l1 == null ? 0 :l1.val )+ (l2 == null ? 0 : l2.val) + carry;
            head.next = new ListNode(sum % 10);
            head = head.next;
            carry = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2!= null ? l2.next : null;
        }
        return result.next;
    }
}
