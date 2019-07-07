//https://www.interviewbit.com/problems/preorder-traversal/

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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(A != null){
            ans.add(A.val);
            if(A.left == null)
                A = A.right;
            else{
                TreeNode ptr = A.left;
                while(ptr.right != null)
                    ptr = ptr.right;
                ptr.right = A.right;
                A = A.left;
            }
        }
        return ans;
    }
}
