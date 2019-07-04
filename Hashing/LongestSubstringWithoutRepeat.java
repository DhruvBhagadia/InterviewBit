//https://www.interviewbit.com/problems/longest-substring-without-repeat/

public class Solution {
    public int lengthOfLongestSubstring(String str) {
        int start = 0;
        int end = start+1;
        HashSet<Character> set = new HashSet<Character>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        set.add(str.charAt(start));
        while(end < str.length() && start < str.length()){
            char current = str.charAt(end);
            System.out.println(set);
            System.out.println(start);
            if(set.contains(current)){
                map.put(str.substring(start, end), (end-start));
                while(str.charAt(start) != current)
                    start++;
                start++;
            }
            else
                set.add(current);
            end++;
        }
        map.put(str.substring(start, end), (end-start));
        int max = Integer.MIN_VALUE;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((int)pair.getValue() > max)
                max = (int)pair.getValue();
            it.remove();
        }
        return max;    
    }
}

