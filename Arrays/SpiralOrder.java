//https://www.interviewbit.com/problems/spiral-order-matrix-ii/

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<A; i++){
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int j=0; j<A; j++)
                a.add(0);
            ans.add(a);
        }
        int s=0;
        int req = A/2;
        int count = 1;
        int n = A;
        if(A%2 == 1)
            req = (A+1)/2;
        while(s < req){
            for(int i=s, j=s; j<=n-1; j++)
                ans.get(i).set(j, count++);
            for(int i=s+1, j=n-1; i<=n-1; i++)
                ans.get(i).set(j, count++);
            for(int i=n-1, j=n-2; j>=s; j--)
                ans.get(i).set(j, count++);
            for(int i=n-2, j=s; i>=s+1; i--)
                ans.get(i).set(j, count++);
            n--;
            s++;
        }
        return ans;
    }
}
