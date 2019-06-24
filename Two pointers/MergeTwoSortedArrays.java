//https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/

public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int pa=0;
        for(int i=0; i<b.size(); i++){
            while(pa<a.size() && a.get(pa)<=b.get(i))
                pa++;
            a.add(pa, b.get(i));
            pa++;
        }
    }
}
