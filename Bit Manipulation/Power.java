//https://www.interviewbit.com/problems/implement-power-function/

public class Solution {
    public int pow(int x, int n, int d) {
    if (n == 0) 
        return 1 % d;
    long ans = 1;
    while (n > 0) {
        if (n % 2 == 1){
            ans = (ans * x) % d;
            n--;
        } 
        else{
            x = (x * x) % d;
            n /= 2;
        }
    }
    if (ans < 0) 
        ans = (ans + d) % d;
    return (int)ans;
    }
}
