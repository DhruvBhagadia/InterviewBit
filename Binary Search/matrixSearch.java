//https://www.interviewbit.com/problems/matrix-search/

public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if(a.size() == 1)
            if(Arrays.binarySearch(a.get(0).toArray(), b) >= 0)
                return 1;
            else 
                return 0;
        else{
            Boolean found=false;
            int index=0;
            for(int i=0; i<a.size()-1; i++){
                if(a.get(i).get(0) <= b && b <= a.get(i+1).get(0)){
                    index = i;
                    found=true;
                    break;
                }
            }
            if(Arrays.binarySearch(a.get(a.size()-1).toArray(), b) >= 0)
                return 1;
            if(a.size()>1 && !found)
                return 0;
            if((Arrays.binarySearch(a.get(index).toArray(), b) >= 0) || ((Arrays.binarySearch(a.get(index+1).toArray(), b) >= 0)))
                return 1;
            else 
                return 0;
        }
    }
}
