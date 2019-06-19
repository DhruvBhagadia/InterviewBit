//https://www.interviewbit.com/problems/hotel-bookings-possible/

public class Solution {
    // public void merge(ArrayList<Integer> arrive, ArrayList<Integer> depart, int l, int m, int r) { 
    //     int n1 = m-l+1; 
    //     int n2 = r-m; 
    //     int L[] = new int [n1]; 
    //     int R[] = new int [n2];
    //     int LD[] = new int [n1]; 
    //     int RD[] = new int [n2];
    //     for (int i=0; i<n1; i++){
    //         L[i] = arrive.get(l+i);
    //         LD[i] = depart.get(l+i);
    //     } 
    //     for (int j=0; j<n2; ++j) {
    //         R[j] = arrive.get(m+1+j); 
    //         RD[j] = depart.get(m+1+j); 
    //     }
    //     int i = 0, j = 0; 
    //     int k = l; 
    //     while (i<n1 && j<n2) { 
    //         if (L[i] <= R[j]) { 
    //             arrive.set(k, L[i]); 
    //             depart.set(k, LD[i]); 
    //             i++; 
    //         } 
    //         else{ 
    //             arrive.set(k, R[j]); 
    //             depart.set(k, RD[j]); 
    //             j++; 
    //         } 
    //         k++; 
    //     } 
    //     while (i < n1) { 
    //         arrive.set(k, L[i]); 
    //         depart.set(k, LD[i]); 
    //         i++; 
    //         k++; 
    //     } 
    //     while (j < n2) { 
    //         arrive.set(k, R[j]); 
    //         depart.set(k, RD[j]); 
    //         j++; 
    //         k++; 
    //     } 
    // } 
    // void sort(ArrayList<Integer> arrive, ArrayList<Integer> depart, int l, int r){ 
    //     if (l < r){ 
    //         int m = (l+r)/2;  
    //         sort(arrive, depart, l, m); 
    //         sort(arrive, depart, m+1, r);
    //         merge(arrive, depart, l, m, r); 
    //     } 
    // }
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int rooms=0, i=0, j=0;
        while(rooms<=K && i<arrive.size() && j<depart.size()){
            if(arrive.get(i)<depart.get(j)){
                rooms++;
                i++;   
            }
            else{
                rooms--;
                j++;
            }
        }
        if(rooms<=K)
            return true;
        else
            return false;
    }
}
