//https://www.interviewbit.com/problems/anagrams/

public class Solution {
	public Boolean anagram(String first, String second){
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i=0; i<first.length(); i++){
			set1.add(first.charAt(i));
			Integer j = map1.get(first.charAt(i));
			map1.put(first.charAt(i), (j == null) ? 1 : j+1);
		}
		for(int i=0; i<second.length(); i++){
			set2.add(second.charAt(i));
			Integer j = map2.get(second.charAt(i));
			map2.put(second.charAt(i), (j == null) ? 1 : j+1);
		}
		if(set1.containsAll(set2) && set2.containsAll(set1) && map1.equals(map2) && map2.equals(map1))
			return true;
		return false;	
	}

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    	ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<A.size()-1; i++){
    		for(int j=i+1; j<A.size(); j++){
    			if(anagram(A.get(i), A.get(j))){
    				ArrayList<Integer> a = new ArrayList<Integer>();
    				a.add(i+1);
    				a.add(j+1);
    				ans.add(a);
    			}
    		}
    	}
    	return ans;
    }
}
