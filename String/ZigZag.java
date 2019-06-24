//https://www.interviewbit.com/problems/zigzag-string/

public class Solution {
    public String convert(String A, int B) {
        if(B == 1)
            return A;
        StringBuilder[] arr = new StringBuilder[B];
        for(int i=0; i<B; i++)
            arr[i] = new StringBuilder("");
        int row=0;
        Boolean first=true;
        for(int  i=0; i<A.length(); i++){
            if(first){
                arr[row].append(Character.toString(A.charAt(i)));
                row++;
                if(row==B){
                    first=false;
                    row=B-2;
                    if(row==0)
                        first=true;
                }
            }
            else{
                arr[row].append(Character.toString(A.charAt(i)));
                row--;
                if(row == 0)
                    first=true;
            }
        }
        StringBuilder ans = new StringBuilder("");
        for(int i=0; i<B; i++)
            ans.append(arr[i]);
        return ans.toString();
    }
}
