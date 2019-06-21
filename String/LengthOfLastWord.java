//https://www.interviewbit.com/problems/length-of-last-word/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int count=0;
        int prev=0;
        Boolean found_alphabet = true;
        for(int i=0, j=0; i<A.length();){
            if(A.charAt(i) == ' '){
                found_alphabet = false;
                prev=count;
                count=0;
                while(i<A.length() && A.charAt(i) == ' '){
                    i++;
                }
                if(i<A.length())
                    found_alphabet = true;
                j=i;
            }
            else{
                count++;
                i++;
            }
        }
        if(!found_alphabet)
            return prev;
        else
            return count;
    }
}
