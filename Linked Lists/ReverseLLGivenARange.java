//https://www.interviewbit.com/problems/reverse-link-list-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
 
 //first slices the part of linkedlist wanted to be reversed and then again inserts it in between
public class Solution {
    public ListNode reverse(ListNode root){
        ListNode c=root, prev=null, t=null;
        while(c != null){
            t = c.next;
            c.next = prev;
            prev = c;
            c = t;
        }
        return prev;
    }
    
    public ListNode reverseBetween(ListNode A, int B, int C) {
        int count=1;
        ListNode c=A, prev=null;
        while(count++ != B){
            prev = c;
            c = c.next;
        }
        ListNode current = new ListNode(c.val);
        ListNode root = current;
        c = c.next;
        count--;
        while(count++ != C){
            current.next = new ListNode(c.val);
            c = c.next;
            current = current.next;
        }
        if(prev == null)
            A = reverse(root);
        else
            prev.next = reverse(root);
        ListNode k = A;
        while(k.next != null)
            k = k.next;
        k.next = c;
        return A;
    }
}
