//https://www.interviewbit.com/problems/first-missing-integer/

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int n=A.size();
        for(int i=0; i<A.size(); i++){
            if(A.get(i) <= 0)
                A.set(i, n+2);
        }
        for(int i=0; i<A.size(); i++){
            int a = Math.abs(A.get(i));
            if(a>=1 && a<=(n)){
                A.set(a-1, A.get(a-1)-(2*A.get(a-1)));
            }
        }
        for(int i=0; i<A.size(); i++){
            if(A.get(i) > 0)
                return i+1;
        }
        return (n+1);
    }
}
