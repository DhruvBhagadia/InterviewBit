//https://www.interviewbit.com/problems/inorder-traversal/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(A != null){
            if(A.left == null){
                ans.add(A.val);
                A = A.right;
            }
            else{
                TreeNode ptr = A.left;
                while(ptr.right != null && ptr.right != A)
                    ptr = ptr.right;
                if(ptr.right == null){
                    ptr.right = A;
                    A = A.left;
                }
                if(ptr.right == A){
                    ptr.right = null;
                    ans.add(A.val);
                    A = A.right;
                }
            }
        }
        return ans;
    }
}
