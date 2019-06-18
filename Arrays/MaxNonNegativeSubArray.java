//https://www.interviewbit.com/problems/max-non-negative-subarray/

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> fina = new ArrayList<Integer>();
        int n = A.size();
        long sum = 0;
        long f_sum = 0;
        for(int i=0; i<A.size(); i++){
            while(i<n && A.get(i) >= 0){
                sum += A.get(i);
                arrlist.add(A.get(i));
                i++;
            }
            if(i<n && A.get(i) < 0){
                if(fina.size() == 0){
                    fina = (ArrayList<Integer>) arrlist.clone();
                    f_sum = sum;
                    sum = 0;
                    arrlist.clear();
                }
                else{
                    if(sum > f_sum){
                        fina = (ArrayList<Integer>) arrlist.clone();
                        f_sum = sum;
                    }
                    else if(sum == f_sum){
                        if(arrlist.size() > fina.size()){
                            fina = (ArrayList<Integer>) arrlist.clone();
                            f_sum = sum;
                        }
                        else if((arrlist.size() == fina.size()) && (arrlist.get(0) < fina.get(0))){
                            fina = (ArrayList<Integer>) arrlist.clone();
                            f_sum = sum;
                        }
                    }
                    sum = 0;
                    arrlist.clear();
                }
            }
        }
        if(fina.size() == 0)
            fina = (ArrayList<Integer>) arrlist.clone();
        else{
                    if(sum > f_sum){
                        fina = (ArrayList<Integer>) arrlist.clone();
                        f_sum = sum;
                    }
                    else if(sum == f_sum){
                        if(arrlist.size() > fina.size()){
                            fina = (ArrayList<Integer>) arrlist.clone();
                            f_sum = sum;
                        }
                        else if((arrlist.size() == fina.size()) && (arrlist.get(0) < fina.get(0))){
                            fina = (ArrayList<Integer>) arrlist.clone();
                            f_sum = sum;
                        }
                    }
                    sum = 0;
                    arrlist.clear();
                }
        return fina;
    }
}
