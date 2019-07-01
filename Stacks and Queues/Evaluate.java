//https://www.interviewbit.com/problems/evaluate-expression/

public class Solution {
	public int ev(int a, int b,  String op){
		if(op.equals("+"))
			return a+b;
		else if(op.equals("-"))
			return a-b;
		else if(op.equals("*"))
			return a*b;
		else if(op.equals("/"))
			return a/b;
		return 1;
	}

    public int evalRPN(ArrayList<String> A) {
    	Stack<Integer> stack = new Stack<Integer>();
    	HashSet<String> set = new HashSet<String>();
    	set.add("+");
    	set.add("*");
    	set.add("/");
    	set.add("-");
    	for(int i=0; i<A.size(); i++){
    		if(set.contains(A.get(i))){
    			int a = stack.pop();
    			int b = stack.pop();
    			String op = A.get(i);
    			stack.push(ev(b, a, op));
    		}
    		else{
    			stack.push(Integer.parseInt(A.get(i)));
    		}
    	}
    	return stack.pop();
    }
}
