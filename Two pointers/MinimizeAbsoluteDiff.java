//https://www.interviewbit.com/problems/minimize-the-absolute-difference/

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int a=A.get(A.size()-1), b=B.get(B.size()-1), c=C.get(C.size()-1);
        int pa=A.size()-1, pb=B.size()-1, pc=C.size()-1;
        int min=Integer.MAX_VALUE;
        
        while(true){
            int ma=Math.max(a, Math.max(b, c));
            int mi=Math.min(a, Math.min(b, c));
            if(Math.abs(ma-mi) < min){
                min = Math.abs(ma-mi);
            }
            if(ma == a){
                pa--;
                if(pa < 0)
                    break;
                a = A.get(pa);
            }
            else if(ma == b){
                pb--;
                if(pb < 0)
                    break;
                b = B.get(pb);
            }
            else if(ma == c){
                pc--;
                if(pc < 0)
                    break;
                c = C.get(pc);
            }
        }
        return min;
    }
}
