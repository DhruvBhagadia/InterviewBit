 //https://www.interviewbit.com/problems/3-sum/

 public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0; i<A.size()-2; i++){
            int left=i+1;
            int right=A.size()-1;
            int p_left=i+1;
            int p_right=A.size()-1;
            while(left<right){
                if((A.get(i)+A.get(left)+A.get(right)) == B)
                    return B;
                p_left=left;
                p_right=right;
                if((A.get(i)+A.get(left)+A.get(right)) > B)
                    right--;
                else
                    left++;
            }
            if(Math.abs(B-(A.get(i)+A.get(p_left)+A.get(p_right))) < min){
                min = Math.abs(B-(A.get(i)+A.get(p_left)+A.get(p_right)));
                sum = (A.get(i)+A.get(p_left)+A.get(p_right));
            }
        }
        return sum;
    }
}