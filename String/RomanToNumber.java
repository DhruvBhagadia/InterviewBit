//https://www.interviewbit.com/problems/roman-to-integer/

public class Solution {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    public int romanToInt(String A) {
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int sum=0;
        for(int i=0; i<A.length(); i++){
            if(((i+1)<A.length()) && map.containsKey(A.substring(i, i+2))){
                sum += map.get(A.substring(i, i+2));
                i++;
            }
            else
                sum += map.get(A.substring(i, i+1));
        }
        return sum;
    }
}
