//https://www.interviewbit.com/problems/kth-smallest-element-in-tree/

public class Solution {
    public void inOrderTraversal(TreeNode A, ArrayList<Integer> in_order){
        if(A == null)
            return;
        else{
            inOrderTraversal(A.left, in_order);
            in_order.add(A.val);
            inOrderTraversal(A.right, in_order);
        }
    }
    
    public int kthsmallest(TreeNode A, int B) {
        ArrayList<Integer> in_order = new ArrayList<Integer>();
        inOrderTraversal(A, in_order);
        return in_order.get(B-1);
    }
}