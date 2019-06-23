///https://www.interviewbit.com/problems/matrix-median/

public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int r=A.size();
        int c=A.get(0).size();
        for(int i=0; i<r; i++){
            if(A.get(i).get(0)<min)
                min=A.get(i).get(0);
            if(A.get(i).get(c-1)>max)
                max=A.get(i).get(c-1);
        }
        int req=(r*c+1)/2;
        while(min<max){
            int mid=(min+max)/2;
            int smaller=0;
            int total=0;
            for(int i=0; i<r; i++){
                int in=Arrays.binarySearch(A.get(i).toArray(), mid);
                if(in<0)
                    smaller=Math.abs(in)-1;
                else{
                    while(in<c && A.get(i).get(in) == mid)
                        in++;
                    smaller=in;
                }
                total += smaller;
            }
            if(total < req)
                min=mid+1;
            else
                max=mid;
        }
        return min;
    }
}
