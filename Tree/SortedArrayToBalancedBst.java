//https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/

public class Solution {
    int i=0;
    List<Integer> list;
    
    void inOrder(TreeNode A){
        if(A == null)
            return;
        else{
            inOrder(A.left);
            A.val = list.get(i++);
            inOrder(A.right);
        }
    }
    
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int count = 0;
        list = a;
        TreeNode root = null;
        
        while(count != a.size()){
            TreeNode new_node = new TreeNode(1);
            queue.add(new_node);
            if(root == null){
                root = new_node;
            }
            else{
                TreeNode temp = queue.peek();
                if(temp.left != null && temp.right != null){
                    queue.remove();
                    temp = queue.peek();
                }
                if(temp.left == null)
                    temp.left = new_node;
                else
                    temp.right = new_node;
            }
            count++;
        }
        
        inOrder(root);
        
        return root;
    }
}
