package leetcode.simple;

import leetcode.simple.datatype.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class S17 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;
        while (curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            }else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }
}
