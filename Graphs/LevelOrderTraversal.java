//https://www.interviewbit.com/problems/level-order/

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        Queue<TreeNode> q2 = new LinkedList<>();
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        while(true){
            while(!q.isEmpty()){
                TreeNode ptr = q.remove();
                arrlist.add(ptr.val);
                if(ptr.left != null)
                    q2.add(ptr.left);
                if(ptr.right != null)
                    q2.add(ptr.right);
            }
            ans.add(arrlist);
            arrlist = new ArrayList<Integer>();
            if(q2.isEmpty())
                break;
            q = q2;
            q2 = new LinkedList<>();
        }
        return ans;
    }
}
