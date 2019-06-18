//https://www.interviewbit.com/problems/prime-sum/

public class Solution {
    public int isPrime(int A) {
        if(A == 1)
            return 0;
        for(int i=2; i<=Math.sqrt(A); i++)
            if(A%i == 0)
                return 0;
        return 1;
    }
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        for(int i=0; i<primes.size(); i++){
            if(isPrime(A-primes.get(i)) == 1){
                ans.add(primes.get(i));
                ans.add(A-primes.get(i));
                break;
            }
        }
        return ans;
    }
}
