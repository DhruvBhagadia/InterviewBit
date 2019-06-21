//https://www.interviewbit.com/problems/grid-unique-paths/

import java.math.*;

public class Solution {
    public int ncr(int N, int R) {
        BigInteger ans = new BigInteger("1");
        ans = fact(N).divide((fact(N-R).multiply(fact(R))));
        BigInteger modu = new BigInteger("1000000007");
        ans = ans.mod(modu);
        return ans.intValue();
    }
    
    public BigInteger fact(int N) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= N; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact;
    }    
    public int uniquePaths(int A, int B) {
        if((A == 1) || (B == 1))
            return 1;
        if(A>B)
            return ncr(A+B-2, A-1);
        else
            return ncr(A+B-2, B-1);
    }
}
