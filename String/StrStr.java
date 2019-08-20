//https://www.interviewbit.com/problems/implement-strstr/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        for(int i=0, j=B.length(); j<=A.length(); i++, j++){
            String subs = A.substring(i, j);
            if(subs.hashCode() == B.hashCode() && subs.equals(B))
                return i;
        }
        return -1;
    }
}
