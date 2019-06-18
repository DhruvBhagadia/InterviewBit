//https://www.interviewbit.com/problems/add-one-to-number/
import java.math.*;
public class Solution {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int n = A.size(); 
        A.set(n-1, A.get(n-1) + 1); 
        int carry = A.get(n-1) / 10; 
        A.set(n-1, A.get(n-1) % 10); 
        for (int i = n-2; i >= 0; i--){ 
            if (carry == 1) { 
            A.set(i, A.get(i) + 1); 
            carry = A.get(i) / 10; 
            A.set(i, A.get(i) % 10); 
            } 
        }  
        if (carry == 1) 
        A.add(0, 1);
        for(int i=0; i<n; i++){
            if(A.get(i) == 0)
                A.remove(i);
            else
                break;   
        }
        return A;
    }
}
