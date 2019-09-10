//https://www.interviewbit.com/problems/postorder-traversal/

public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        TreeNode last_node = null;
        while(!s.isEmpty() || A != null){
            if(A != null){
                s.push(A);
                A = A.left;
            }
            else{
                TreeNode peeked = s.peek();
                if(peeked.right != null && last_node != peeked.right)
                    A = peeked.right;
                else{
                    ans.add(peeked.val);
                    last_node = s.pop();
                }
            }
        }
        return ans;
    }
}
