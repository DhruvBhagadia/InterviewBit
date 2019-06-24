//https://www.interviewbit.com/problems/3-sum-zero/

public class Solution {
     public static Boolean contain(ArrayList<ArrayList<Integer>> ans, int a, int b, int c){
         ArrayList<Integer> t1 = new ArrayList<Integer>();
         t1.add(a);
         t1.add(b);
         t1.add(c);
        for(ArrayList<Integer> ele: ans)      
            if(ele.equals(t1))
                return true;
        return false;
    }
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        for (int i=0; i<=(A.size()-3); i++) {
            int sum=0-A.get(i), left=i+1, right=A.size()-1;
            while(left < right){
                int temp = A.get(left) + A.get(right);
                if ((temp == sum) && (!contain(ans, A.get(i), A.get(left), A.get(right)))) {
                    ArrayList<Integer> t1 = new ArrayList<Integer>();
                    t1.add(A.get(i));
                    t1.add(A.get(left));
                    t1.add(A.get(right));
                    ans.add(t1);
                    while(left<right && A.get(left)==A.get(left+1)) left++;
                    while(left<right && A.get(right)==A.get(right-1)) right--;
                    left++; right--;
                }
                else if(temp > sum) right--;
                else left++;
            }}
        return ans;
    }
}
