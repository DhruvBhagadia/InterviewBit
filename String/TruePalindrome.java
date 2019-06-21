//https://www.interviewbit.com/problems/palindrome-string/

public class Solution {
    public int isPalindrome(String A) {
        int low=0;
        int high=A.length()-1;
        A = A.toUpperCase();
        while(low <= high){
            if(!(A.charAt(low)>='A' && A.charAt(low)<='Z'))
                low++;
            else if(!(A.charAt(high)>='A' && A.charAt(high)<='Z'))
                high--;
            else if(A.charAt(low) == A.charAt(high)){
                low++;
                high--;
            }
            else
                return 0;   
        }
        return 1;
    }
}
