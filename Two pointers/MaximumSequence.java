//https://www.interviewbit.com/problems/max-continuous-series-of-1s/

public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int i=0, j=0;
        int bl=0, br=0;
        int n=0;
        int max=Integer.MIN_VALUE;
        for(; i<A.size();){
            if(n>B){
                //Update if optimal bl and br
                if((i-j)>max){
                    max=(i-j);
                    bl=j;
                    br=i;
                }
                //update j till the time n becomes <= B
                while(n>B){
                    if(A.get(j) == 0)
                        n--;
                    j++;
                }
                n--;
            }
            else if(A.get(i) == 0){
                n++;
                if(n<=B)
                    i++;
            }
            else
                i++;
        }
        if((i-1-j)>max){
            max=(i-j);
            bl=j;
            br=i;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k=bl; k<br; k++)
            ans.add(k);
        return ans;
    }
}
