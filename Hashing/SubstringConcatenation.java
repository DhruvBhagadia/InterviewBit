//https://www.interviewbit.com/problems/substring-concatenation/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findSubstring(String A, final List<String> B) {
        int nk = (B.size()*B.get(0).length());
        int n = B.get(0).length();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<String> set = new ArrayList<String>();
        for(int i=0; i<B.size(); i++)
            set.add(B.get(i));
        for(int i=0, j=nk; j <= A.length(); i++, j++){
            ArrayList<String> cloned = (ArrayList<String>) set.clone();
            int k=0;
            for(k=i; k<j; k+=n){
                if(!cloned.contains(A.substring(k, k+n)))
                    break;
                cloned.remove(A.substring(k, k+n));
            }
            if(k == j)
                ans.add(i);
        }
        return ans;
    }
}