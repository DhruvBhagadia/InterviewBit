//https://www.interviewbit.com/problems/permutations/

public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    public void permutation(ArrayList<Integer> A, int start, int end){
        if(start == end){
            ans.add((ArrayList<Integer>)A.clone());
            return;
        }
        for(int i=start; i<end; i++){
            Collections.swap(A, start, i);
            permutation(A, start+1, end);
            Collections.swap(A, start, i);
        }
    }
    
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ans = new ArrayList<ArrayList<Integer>>();
        permutation(A, 0, A.size());
        return ans;
    }
}
