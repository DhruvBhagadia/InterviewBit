//https://www.interviewbit.com/problems/path-sum/

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
    public Boolean path(TreeNode A, int sum, int target) {
        if(A == null)
            return false;
        else if(A.right == null && A.left == null){
            if(A.val+sum == target)
                return true;
            else
                return false;
        }
        else{
            if((A.left != null && path(A.left, sum+A.val, target)) 
            || (A.right != null && path(A.right, sum+A.val, target)))
                return true;
            else
                return false;
        }
    }
    
    public int hasPathSum(TreeNode A, int B) {
        if(path(A, 0, B))
            return 1;
        else
            return 0;
    }
}
