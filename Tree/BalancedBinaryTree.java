//https://www.interviewbit.com/problems/balanced-binary-tree/

public class Solution {
    public int height(TreeNode root) {
          if((root == null) || (root.left == null && root.right == null))
            return 0;
          else
            return 1+Math.max(height(root.left), height(root.right));

    }

    public int isBalanced(TreeNode A) {
        if(A == null)
            return 1;
        int l=0, r=0;
        if(A.left != null)
        	l = 1+height(A.left);
        if(A.right != null)
        	r = 1+height(A.right);
        if(Math.abs(l-r) <= 1 && isBalanced(A.left) == 1 && isBalanced(A.right) == 1) 
            return 1;
        else
            return 0;
    }
}