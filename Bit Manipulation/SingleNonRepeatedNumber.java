//https://www.interviewbit.com/problems/single-number/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ans=0;
        for(int i=0; i<A.size(); i++)
            ans = ans^A.get(i);
        return ans;
    }
}
