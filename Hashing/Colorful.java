//https://www.interviewbit.com/problems/colorful-number/

public class Solution {
    public int colorful(int A) {
        String inp = Integer.toString(A);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<inp.length(); i++){
        	for(int j=i+1; j<=inp.length(); j++){
        		String t = inp.substring(i, j);
        		int prod = 1;
        		for(int k=0; k<t.length(); k++)
        			prod *= Character.getNumericValue(t.charAt(k));
        		if(set.contains(prod))
        			return 0;
        		set.add(prod);
        	}
        }
        return 1;
    }
}
