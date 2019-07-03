//https://www.interviewbit.com/problems/fraction/

public class Solution {
    public String fractionToDecimal(int A, int B) {
        long a=A, b=B;
        if(a%b == 0)
            return Long.toString(a/b);
        StringBuilder ans = new StringBuilder();
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        if((a<0 && b>0) || (a>0 && b<0))
            ans.append("-");
        a = Math.abs(a);
        b = Math.abs(b);
        long num = a/b;
        ans.append(Long.toString(num)+".");
        int base = ans.length();
        int index = 0;
        long rem = a%b;
        map.put(rem, index);
        index++;
        while(rem != 0){
            rem *= 10;
            num = (rem/b);
            ans.append(Long.toString(num));
            rem = rem%b;
            if(map.containsKey(rem)){
                String subs = ans.substring(base+map.get(rem), ans.length());
                ans.insert(base+map.get(rem), "("+subs+")");
                ans.delete(base+map.get(rem)+2+subs.length(), ans.length());
                break;
            }
            else{
                map.put(rem, index);
                index++;   
            }
        }
        return ans.toString();
    }
}
