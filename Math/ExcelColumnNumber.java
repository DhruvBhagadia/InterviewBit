//https://www.interviewbit.com/problems/excel-column-number/

public class Solution {
    public int titleToNumber(String A) {
        int sum=0;
        for (int i=A.length()-1, j=0; i>=0; i--, j++) 
            sum += (A.charAt(i)-'A'+1)*Math.pow(26, j);
        return sum;
    }
}
