//https://www.interviewbit.com/problems/invert-the-binary-tree/

public class Solution {
    public TreeNode invertTree(TreeNode A) {
        if(A != null){
            TreeNode t = A.left;
            A.left = A.right;
            A.right = t;
            if(A.left != null)
                invertTree(A.left);
            if(A.right != null)
                invertTree(A.right);
        }
        return A;
    }
}
