//https://www.interviewbit.com/problems/partition-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode delete(ListNode prev, ListNode to_be_deleted, ListNode root){
        if(prev == null)
            root = to_be_deleted.next;
        else
            prev.next = to_be_deleted.next;
        return root;
    }
    
    public ListNode partition(ListNode A, int B) {
        ListNode root2 = null;
        ListNode current = null;
        ListNode ptr = A;
        ListNode prev = null;
        Boolean added = false;
        while(ptr != null){
            Boolean deleted = false;
            if(ptr.val < B){
                if(!added){
                    current = new ListNode(ptr.val);
                    root2 = current;
                    added = true;
                }
                else{
                    current.next = new ListNode(ptr.val);
                    current = current.next;
                }
                A = delete(prev, ptr, A);
                deleted = true;
            }
            if(!deleted)
                prev = ptr;
            ptr = ptr.next;
        }
        if(root2 == null)
            return A;
        else{
            current.next = A;
            return root2;
        }
    }
}
