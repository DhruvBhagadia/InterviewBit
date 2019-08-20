//https://www.interviewbit.com/problems/identical-binary-trees/

public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if((A == null && B != null) || (A != null && B == null))
            return 0;
        if((A == null && B == null) || ((A.val == B.val) && 
            (isSameTree(A.left, B.left) == 1) && (isSameTree(A.right, B.right) == 1)))
            return 1;
        else 
            return 0;
    }
}
