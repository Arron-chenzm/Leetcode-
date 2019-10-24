package Leetcode.isPalindrome;
import java.util.ArrayList;
class Solution {
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer>  list = new ArrayList<>();
        ListNode root = head;
        if(head == null||head.next==null){
            return true;
        }
        while(root!=null){
            list.add(root.val);
            root = root.next;
        }
        for(int i = 0;i<list.size()/2;i++){
            int a = list.get(i);
            int b = list.get(list.size()-1-i);
            System.out.println(list.get(i));
            System.out.println(list.get(list.size()-1-i));
            if(list.get(i)!=list.get(list.size()-1-i)){
                return false;
            }else{
                continue;
            }
        }
        return true;
    }
    public boolean isPalindrome2(ListNode head)
    /**
     * 问题主要在于，最后得到的数可能很大，所以用int可能失败，改用float；
     */
    {
        if(head==null||head.next==null){
            return true;
        }
        float s1=0;
        float s2 = 0;
        float t = 1;
        while(head!=null){
            s1 = s1*10+head.val;
            s2 = s2+head.val*t;
            t *= 10;
            head = head.next;
        }
        return s1==s2?true:false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(128);
        ListNode b = new ListNode(128);
        a.next = b;
        System.out.println(isPalindrome(a));
    }
}