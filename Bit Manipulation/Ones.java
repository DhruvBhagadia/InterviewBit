//https://www.interviewbit.com/problems/number-of-1-bits/ 

public class Solution {
    public int numSetBits(long a) {
        int c=0;
        long b=1;
        while(a != 0){
            if((a&b) == 1)
                c++;
            a = a >> 1;
        }
        return c;
    }
}
