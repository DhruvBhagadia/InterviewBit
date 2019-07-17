//https://www.interviewbit.com/problems/pascal-triangle/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if(A == 0)
            return ans;
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        ans.add(arrlist);
        for(int i=1; i<A; i++){
            int j=0;
            arrlist = new ArrayList<Integer>();
            while(j <= i){
                if(j == 0 || j == i)
                    arrlist.add(1);
                else
                    arrlist.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                j++;
            }
            ans.add(arrlist);
        }
        return ans;
    }
}
