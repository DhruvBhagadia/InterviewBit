//minimum-characters-required-to-make-a-string-palindromic

public class Solution {
    public Boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++)
            if(str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        return true;
    }
    
    public int solve(String A) {
        int count=0;
        for(int i=0; i<A.length(); i++)
            if(isPalindrome(A.substring(0, A.length()-i)))
                break;
            else
                count++;
        return count;
    }
}
