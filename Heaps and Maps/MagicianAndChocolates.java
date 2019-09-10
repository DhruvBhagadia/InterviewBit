//https://www.interviewbit.com/problems/magician-and-chocolates/

public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0; i<B.size(); i++)
            pq.add(B.get(i));
        long ans = 0;
        int it = 0;
        
        while(it++ != A){
            int max = pq.poll();
            ans = (ans+max)%1000000007;
            pq.add(max/2);
        }

        return (int)ans;
    }
}

