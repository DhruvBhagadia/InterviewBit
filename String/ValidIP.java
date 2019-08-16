//https://www.interviewbit.com/problems/valid-ip-addresses/

public class Solution {
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> ans = new  ArrayList<String>();
        StringBuilder strb = new StringBuilder(A);
        int n = A.length()+3; //+3 because we are going to insert 3 '.' in the string
        for(int i=1; i<4; i++){
            for(int j=i+2; j<=i+4 && j<n; j++){
                for(int k=j+2; k<=j+4 && k<n; k++){
                    strb.insert(i, ".");
                    strb.insert(j, ".");
                    strb.insert(k, ".");
                    String[] arr = strb.toString().split("\\.");
                    int ii=0;
                    if(arr.length == 4){ //after splitting we got 4 sections
                        for(ii=0; ii<arr.length; ii++){
                            String cur = arr[ii];
                            if((cur.length() > 3) || (cur.length() == 0) || ((cur.charAt(0) == '0') && (cur.length() != 1)) || (Integer.parseInt(cur) > 255))
                                break;
                        }
                    }
                    if(ii == arr.length)
                        ans.add(strb.toString());
                    strb = new StringBuilder(A);
                }
            }
        }
        return ans;
    }
}
