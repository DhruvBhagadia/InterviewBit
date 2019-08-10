//https://www.interviewbit.com/problems/anti-diagonals/

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int n = A.size();
        for(int i=0, j=0; j <= n-1; j++){
            int ti=i, tj=j;
            ArrayList<Integer> a = new ArrayList<Integer>();
            while(tj >= 0){
                a.add(A.get(ti).get(tj));
                ti++;
                tj--;
            }
            ans.add(a);
        }
        for(int i=1, j=n-1; i <= n-1; i++){
            int ti=i, tj=j;
            ArrayList<Integer> a = new ArrayList<Integer>();
            while(ti <= n-1){
                a.add(A.get(ti).get(tj));
                ti++;
                tj--;
            }
            ans.add(a);
        }
        return ans;
    }
}
