//https://www.interviewbit.com/problems/list-cycle/

	/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        ListNode slow = a, fast = a;
        Boolean first = true, flag = false;
        while(fast != null){
            if(!first && slow == fast){
                flag = true;
                break;
            }
            slow = slow.next;
            if(fast.next == null)
                break;
            fast = fast.next.next;
            first = false;
        }
        if(!flag)
            return null;
        else{
            slow = a;
            while(true){
                if(slow == fast){
                    return slow;
                }
                slow = slow.next;
                fast = fast.next;
            }
        }

        //Method2
        /*
            ListNode divert = new ListNode(100);
            ListNode temp = a;
            Boolean flag = false;
            while(temp != null){
                if(temp.next == divert){
                    flag = true;
                    break;
                }
                ListNode t = temp.next;
                temp.next = divert;
                temp = t;
            }
            if(!flag)
                return null;
            else
                return temp;
        */
    }
}
