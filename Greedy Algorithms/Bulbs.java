//https://www.interviewbit.com/problems/bulbs/

public class Solution {
    public int bulbs(ArrayList<Integer> A) {
        int count = 0;
        boolean for_zero_add = true;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == 0 && for_zero_add){
                count++;
                for_zero_add = false;
            }
            else if(A.get(i) == 1 && !for_zero_add){
                count++;
                for_zero_add = true;
            }
        }
        return count;
    }
}
