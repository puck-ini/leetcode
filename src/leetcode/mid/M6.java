package leetcode.mid;

import leetcode.datatype.ListNode;

public class M6 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        //*****************************
        // n + 1 链表获取不到上一节点，但是可以获取到下一节点
        for (int i = 0; i < n + 1; i++){
            first = first.next;
        }
        //*****************************
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
