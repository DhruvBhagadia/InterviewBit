//https://www.interviewbit.com/problems/greatest-common-divisor/

public class Solution {
    public int gcd(int A, int B) {
        if(B == 0)
            return A;
        return gcd(B, A%B);
    }
}
