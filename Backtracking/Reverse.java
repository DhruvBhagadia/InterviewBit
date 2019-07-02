/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode new_root = null;
        if(A.next == null) {
            return A;
        }
        new_root = reverseList(A.next);
        A.next.next = A;
        A.next = null;
        return new_root;
    }
}
