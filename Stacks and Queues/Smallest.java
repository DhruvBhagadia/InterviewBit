//https://www.interviewbit.com/problems/nearest-smaller-element/

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(-1);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(A.get(0));
        for(int i=1; i<A.size(); i++){
            while(!stack.isEmpty() && stack.peek() >= A.get(i))
                stack.pop();
            if(stack.isEmpty())
                ans.add(-1);
            else
                ans.add(stack.peek());
            stack.push(A.get(i));
        }
        return ans;
    }
}
