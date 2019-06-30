//https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode one = new ListNode(2);
        ListNode two = new ListNode(3);
        one = A;
        two = A.next;
        while(two != null){
            while(two.val == one.val){
                two = two.next;
                if(two == null)
                    break;
            }
            one.next = two;
            one = one.next;
        }
        return A;
    }
}
