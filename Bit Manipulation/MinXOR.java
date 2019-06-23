//https://www.interviewbit.com/problems/min-xor-value/

public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.size()-1; i++)
            if((A.get(i)^A.get(i+1))<min)
                min = A.get(i)^A.get(i+1);
        return min;
    }
}
