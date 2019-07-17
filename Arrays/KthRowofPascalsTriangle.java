//https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        
        ArrayList<Integer> prev = new ArrayList<Integer>();
        ArrayList<Integer> current = new ArrayList<Integer>();
        current.add(1);
        
        for(int i=1; i<=A; i++){
            prev = current;
            current = new ArrayList<Integer>();
            int j=0;
            while(j <= i){
                if(j == 0 || j == i)
                    current.add(1);
                else
                    current.add(prev.get(j)+prev.get(j-1));
                j++;
            }
        }
        
        return current;
    }
}
