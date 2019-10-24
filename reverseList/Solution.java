package Leetcode.reverseList;

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode lat = cur.next;
        while(lat!=null){
            cur.next = pre;
            pre = cur;
            cur = lat;
            lat = lat.next;
        }
        cur.next = pre;
        head.next = null;
        return cur;
    }
}
