//https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/

public class Solution {
    public void path(TreeNode A, int sum, int target, ArrayList<ArrayList<Integer>> ans, 
        ArrayList<Integer> cur) {
        if(A == null)
            return;
        else if(A.right == null && A.left == null){
            if(A.val+sum == target){
                cur.add(A.val);
                ans.add((ArrayList<Integer>) cur.clone());
                cur.remove(cur.lastIndexOf(A.val));
            }
            else
                return;
        }
        else{
            cur.add(A.val);
            if(A.left != null)
                path(A.left, sum+A.val, target, ans, cur);
            if(A.right != null)
                path(A.right, sum+A.val, target, ans, cur);
            cur.remove(cur.lastIndexOf(A.val));
        }
    }
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        path(A, 0, B, ans, cur);
        return ans;
    }
}
