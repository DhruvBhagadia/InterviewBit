//https://www.interviewbit.com/problems/distribute-candy/

public class Solution {
    public int candy(ArrayList<Integer> A) {
        ArrayList<Integer> candies = new ArrayList<Integer>();
        int result = 0;
        candies.add(1);
        for(int i=1; i<A.size(); i++){
            if(A.get(i) > A.get(i-1))
                candies.add(candies.get(i-1)+1);
            else
                candies.add(1);
        }
        for(int i=A.size()-2; i>=0; i--){
            if(A.get(i) > A.get(i+1))
                candies.set(i, candies.get(i+1)+1);
        }
        for(int i=0; i<candies.size(); i++)
            result += candies.get(i);
        return result;
    }
}
