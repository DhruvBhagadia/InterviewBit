//https://www.interviewbit.com/problems/distinct-numbers-in-window/

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<B; i++){
            Integer j = map.get(A.get(i));
            map.put(A.get(i), (j == null) ? 1: j+1);
        }
        ans.add(map.size());
        for(int i=1, k=i+B; k<=A.size(); i++, k++){
            int prev = A.get(i-1);
            int next = A.get(k-1);
            Integer j = map.get(prev);
            if(j == 1)
                map.remove(prev);
            else
                 map.put(prev, j-1);
            j = map.get(next);
            map.put(next, (j == null) ? 1: j+1);
            ans.add(map.size());
        }
        return ans;
    }
}
