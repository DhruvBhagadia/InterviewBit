//https://www.interviewbit.com/problems/count-and-say/

public class Solution {
    public String generateNext(String current){
        StringBuilder next = new StringBuilder();
        int  occ = 0;
        for(int i=0; i<current.length(); i++){
            if(i == current.length()-1 || current.charAt(i) != current.charAt(i+1)){
                next.append(Integer.toString(occ+1));
                next.append(Character.toString(current.charAt(i)));
                occ = 0;
            }
            else
                occ++;
        }
        return next.toString();
    }
    
    public String countAndSay(int A) {
        int n = 1;
        String str = "1";
        while(n++ != A){
            str = generateNext(str);
        }
        return str;
    }
}
