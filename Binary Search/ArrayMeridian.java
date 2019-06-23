//https://www.interviewbit.com/problems/median-of-array/
//Reference: https://www.geeksforgeeks.org/median-two-sorted-arrays-different-sizes-ologminn-m/

public class Solution {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(List<Integer> a, List<Integer> b) {
        int n=0, m=0;
        if(a.size()<b.size()){
            n=a.size();
            m=b.size();
        }
        else{
            n=b.size();
            m=a.size();
            List<Integer> t=a;
            a=b;
            b=t;
        }
        int min=0, max=n, i=0, j=0, median=0; 
        while (min <= max){ 
            i=(min+max)/2; 
            j=((n+m+1)/2)-i; 
            if (i<n && j>0 && b.get(j - 1) > a.get(i))      
                min=i+1;  
            else if (i>0 && j<m && b.get(j) < a.get(i-1))      
                max=i-1; 
            else{  
                if (i == 0)          
                    median=b.get(j - 1);  
                else if (j == 0)          
                    median = a.get(i-1);          
                else    
                    median = Math.max(a.get(i-1), b.get(j-1));          
                break; 
            } 
        } 
        if ((n + m)%2 == 1) 
            return (double)median;   
        if (i == n) 
            return (median+b.get(j)) / 2.0; 
        if (j == m) 
            return (median + a.get(i)) / 2.0; 
          
        return (median+Math.min(a.get(i), b.get(j))/2.0);
    }
}
