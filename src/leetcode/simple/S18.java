package leetcode.simple;

import leetcode.datatype.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * 1->2->3->4->5->NULL
 * 5->4->3->2->1->NULL
 */

/**
 * 使用当前节点指针、前一节点指针，记录当前节点以及前一节点，
 * 将当前节点指向前一节点，之后指针前移
 */
public class S18 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode nextNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextNode;
        }
        return pre;
    }
}
