//https://www.interviewbit.com/problems/min-depth-of-binary-tree/

public class Solution {
    int min_depth = Integer.MAX_VALUE;
    
    void depth(TreeNode A, int current_depth){
        if(A == null)
            return;
        else if(A.right == null && A.left == null){
            if(current_depth < min_depth)
                min_depth = current_depth;
            return;
        }
        else{
            if(A.left != null)
                depth(A.left, current_depth+1);
            if(A.right != null)
                depth(A.right, current_depth+1);
        }
    }
    
    public int minDepth(TreeNode A) {
        depth(A, 1);
        return min_depth;
    }
}
