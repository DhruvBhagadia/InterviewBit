//https://www.interviewbit.com/problems/modular-expression/

public class Solution {
    public int Mod(int a, int b, int c) {
        if(a == 0){
            return 0;
        }
        if(b == 0){
            return 1;
        }
        long  temp = 0;        
        if (b%2 == 0) {
            temp = Mod(a, b/2, c);
            temp = (temp*temp)%c;
        } 
        else {
            temp = a%c;
            temp = (temp*Mod(a, b-1, c))%c;
        }
        return (int)((temp+c)% c);
    }
}