//https://www.interviewbit.com/problems/amazing-subarrays/

public class Solution {
    public int solve(String A) {
        HashSet<Character> v = new HashSet<Character>();
        v.add('A');
        v.add('E');
        v.add('I');
        v.add('O');
        v.add('U');
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        int count=0;
        for(int i=0; i<A.length(); i++)
            if(v.contains(A.charAt(i)))
                count += (A.length()-i);
        return count%10003;
    }
}
