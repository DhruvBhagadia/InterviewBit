//https://www.interviewbit.com/problems/highest-product/

public class Solution {
    public int maxp3(ArrayList<Integer> A) {
        Collections.sort(A, Collections.reverseOrder());
        int prod = 1;
        int n = A.size();
        for(int i=0; i<3; i++)
            prod *= A.get(i);
        if(A.get(0)*A.get(n-1)*A.get(n-2) > prod)
            prod = A.get(0)*A.get(n-1)*A.get(n-2);
        return prod;
    }
}
