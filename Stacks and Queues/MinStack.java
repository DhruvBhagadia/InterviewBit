//https://www.interviewbit.com/problems/min-stack/

class Solution {
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min_stack = new Stack<Integer>();	

	Solution(){
		stack = new Stack<Integer>();
		min_stack = new Stack<Integer>();
	}

    public void push(int x) {
        stack.push(x);
        if((!min_stack.isEmpty() && min_stack.peek() > x) || (min_stack.isEmpty()))
        	min_stack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty()){
        	int ele = stack.pop();
        	if(min_stack.peek() == ele)
        		min_stack.pop();
        }
    }

    public int top() {
        if(stack.isEmpty())
        	return -1;
        else
        	return stack.peek();
    }

    public int getMin() {
        if(min_stack.isEmpty())
        	return -1;
        else
        	return min_stack.peek();
    }
}
