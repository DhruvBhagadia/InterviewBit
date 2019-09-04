//https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {

    public TreeNode flatten(TreeNode a) {
        TreeNode temp = a;
        
        while(a != null){
            TreeNode left = a.left;
            TreeNode right = a.right;
            
            if(left != null){
                a.right = left;
                while(left.right != null)
                    left = left.right;
                left.right = right;
                a.left = null;
            }
            a = a.right;
        }
        
        return temp;
    }
}
