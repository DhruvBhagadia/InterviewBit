public class Solution {
    public String reverseWords(String a) {
        String[] arr = a.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--)
            ans.append(arr[i]+" ");
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
