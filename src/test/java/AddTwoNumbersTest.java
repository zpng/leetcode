import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhangpeng on 2017/3/21.
 */
public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        l1.next = l2;
        ListNode l3 = new ListNode(4);
        l2.next = l3;
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(8);
        l4.next = l5;
        ListNode l6 = new ListNode(7);
        l5.next = l6;
        ListNode l7 = new ListNode(7);
        l6.next = l7;
        Assert.assertEquals("1228", toString(new AddTwoNumbers().addTwoNumbers(l1,l4)));
    }

    private String toString(ListNode l4) {
        StringBuilder sb = new StringBuilder();
        while (l4 != null){
            sb.append(l4.val);
            l4 = l4.next;
        }
        return sb.toString();
    }

}