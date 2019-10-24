package Leetcode.sortList;

import java.util.Stack;

public class Solution {
    /**
     * 递归加归并排序，
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if (head ==null||head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode after = null;
        while (fast!=null&&fast.next!=null){
            after = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        after.next = null;
        ListNode L1 = sortList(head);
        ListNode L2 = sortList(slow);
        return mergesort(L1,L2);

    }

    private ListNode mergesort(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            }else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1!=null) cur.next=l1;
        if (l2!=null) cur.next = l2;
        return res.next;
    }

    public static void main(String[] args) {
        Stack<Integer> n = new Stack<>();
        System.out.println(n.search(1));
    }
}
