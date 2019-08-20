//https://www.interviewbit.com/problems/atoi/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int atoi(final String A) {
        Boolean found_digit = false;
        int start = 0;
        for(int i=0; i<A.length(); i++){
            char cur = A.charAt(i);
            if(Character.isDigit(cur) || (cur == '-' && Character.isDigit(A.charAt(i+1))) 
                || ((cur == '+' && Character.isDigit(A.charAt(i+1))))){
                found_digit = true;
                start = i;
                break;
            }
            if(!Character.isWhitespace(cur))
                break;
        }
        if(!found_digit)
            return 0;
        StringBuilder strb = new StringBuilder();
        while(start < A.length() && 
                (Character.isDigit(A.charAt(start)) || 
                (A.charAt(start) == '-') || (A.charAt(start) == '+')))
            strb.append(Character.toString(A.charAt(start++)));
        int ans;
        try{
            ans = Integer.parseInt(strb.toString());
        }
        catch(Exception e){
            if(strb.charAt(0) == '-')
                ans = Integer.MIN_VALUE;
            else
                ans = Integer.MAX_VALUE;
        }
        return ans;
    }
}
