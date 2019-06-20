//https://www.interviewbit.com/problems/palindrome-integer/

public class Solution {
    public int isPalindrome(int A) {
        String in = Integer.toString(A);
        for(int i=0; i<in.length()/2; i++)
            if(in.charAt(i) != in.charAt(in.length()-i-1))
                return 0;
        return 1;
    }
}
