//https://www.interviewbit.com/problems/max-depth-of-binary-tree/

public class Solution {
    int max_depth = Integer.MIN_VALUE;
    
    void depth(TreeNode A, int current_depth){
        if(A == null)
            return;
        else if(A.right == null && A.left == null){
            if(current_depth > max_depth)
                max_depth = current_depth;
            return;
        }
        else{
            if(A.left != null)
                depth(A.left, current_depth+1);
            if(A.right != null)
                depth(A.right, current_depth+1);
        }
    }
    
    public int maxDepth(TreeNode A) {
        depth(A, 1);
        return max_depth;
    }
}
