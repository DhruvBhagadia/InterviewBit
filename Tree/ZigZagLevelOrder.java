//https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/

public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        Queue<TreeNode> q2 = new LinkedList<>();
        int i=0;
        while(true){
            ArrayList<Integer> arrlist = new ArrayList<Integer>();
            while(!q.isEmpty()){
                TreeNode ptr = q.remove();
                if(i%2 == 0)
                    arrlist.add(ptr.val);
                else
                    arrlist.add(0, ptr.val);
                if(ptr.left != null)
                    q2.add(ptr.left);
                if(ptr.right != null)
                    q2.add(ptr.right);
            }
            if(q2.isEmpty())
                break;
            q = q2;
            q2 = new LinkedList<>();
            i++;
            ans.add(arrlist);
        }
        return ans;
    }
}
