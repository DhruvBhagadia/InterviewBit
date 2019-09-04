//https://www.interviewbit.com/problems/least-common-ancestor/

public class Solution {
   
   public Boolean findPath(TreeNode A, int B, ArrayList<Integer> path){
       if(A == null)
            return false;
        path.add(A.val);
        if(A.val == B)
            return true;
        if(A.left != null && findPath(A.left, B, path))
            return true;
        if(A.right != null && findPath(A.right, B, path))
            return true;
        path.remove(path.size()-1); 
        return false;
   } 
    
    public int lca(TreeNode A, int B, int C) {
        ArrayList<Integer> path1 = new ArrayList<Integer>();
        ArrayList<Integer> path2 = new ArrayList<Integer>();
        if(!findPath(A, B, path1))
            return -1;
        if(!findPath(A, C, path2))
            return -1;
        int i; 
        for (i=0; i<path1.size() && i<path2.size(); i++) {  
            if (!path1.get(i).equals(path2.get(i))) 
                break; 
        } 
        return path1.get(i-1);
    }
}
