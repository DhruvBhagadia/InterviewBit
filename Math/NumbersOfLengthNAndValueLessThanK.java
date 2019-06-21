//https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/

public class Solution {
    public boolean zeroPresent(ArrayList<Integer> A,int num){
        for(int i=0;i<A.size();i++){
            if(A.get(i)==num){
                return true;
            }
        }
        return false;
    }
    
    public int getValue(ArrayList<Integer> A, ArrayList<Integer> number, int index, int B){
        if(index==B){
            return 0;
        }
        int less = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<number.get(index)){
                if(A.get(i)==0&&index==0&&B>1)
                    less--;
                less++;
            }
        }
        int result = less*((int)Math.pow(A.size(),B-index-1));
        boolean isPresent = zeroPresent(A,number.get(index));
        if(isPresent){
            result = result+(getValue(A, number, index+1, B));
        }
        return result;
    }
    
    public int solve(ArrayList<Integer> A, int B, int C) {
        String strc = Integer.toString(C);
        if(B > strc.length())
            return 0;
        else if(B < strc.length())
            if(A.contains(0)&&B>1)
                return (int)((A.size()-1)*Math.pow(A.size(), B-1));
            else
                return (int)(Math.pow(A.size(), B));
        else{
            ArrayList<Integer> digits = new ArrayList<Integer>();
            for(int i=0; i<strc.length(); i++)
                digits.add(Character.getNumericValue(strc.charAt(i)));
            return getValue(A, digits, 0, B);
        }
    }
}