//https://www.interviewbit.com/problems/redundant-braces/

public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<Character>();
        int s = 0;
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            if(c == ')'){
                if(s<2)
                    return 1;
                else{
                    while(stack.peek() != '(')
                        stack.pop();
                    stack.pop();
                }
                s = stack.size()-1;
            }
            else{
                stack.push(c);
                if(c == '(')
                    s = 0;
                else
                    s++;
            }
        }
        return 0;
    }
}
