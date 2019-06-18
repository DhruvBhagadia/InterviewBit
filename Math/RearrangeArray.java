//https://www.interviewbit.com/problems/rearrange-array/

public class Solution {
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for(int i=0; i<a.size(); i++){
            int aa = a.get(i);
            int b = a.get(aa);
            int k = aa+(b%n)*n;
            a.set(i, k);
        }
        for(int i=0; i<a.size(); i++){
            int k = a.get(i);
            a.set(i, (k/n));
        }
    }
}
