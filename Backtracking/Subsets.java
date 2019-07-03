//https://www.interviewbit.com/problems/subset/
//generates all subsets but not in order

import java.util.*;

public class Subsets {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    	ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    	int n = A.size();
    	long total = (long) Math.pow(2, n);
    	for(int i=0; i<total; i++){
    		int current = i;
    		ArrayList<Integer> temp = new ArrayList<Integer>();
    		int j=0;
    		while(current != 0){
	    		if((current & 1) == 1){
	    			temp.add(A.get(j));
	    			j++;
	    		}
	    		current = current >> 1;
    		}
    		ans.add(temp);
    	}
    	return ans;
    }

    public static void main(String args[]){
    	ArrayList<Integer> A = new ArrayList<Integer>();
    	A.add(1);
    	A.add(2);
    	A.add(3);
    	subsets(A);
    }
}
