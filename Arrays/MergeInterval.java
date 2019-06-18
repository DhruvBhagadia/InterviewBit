/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

//https://www.interviewbit.com/problems/merge-intervals/

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> ans = new ArrayList<Interval>();
        int chalu=0;
        int khattam=0;
        Boolean first=true;
        Boolean clash=false;
        for(int i=0; i<intervals.size(); i++){
            Interval current = intervals.get(i);
            if(Math.max(current.start, newInterval.start) <= Math.min(current.end, newInterval.end)){
                clash=true;
                if(first){
                    chalu=i;
                    first=false;
                }   
                else
                    khattam=i;
            }
        }
        if(khattam == 0)
            khattam = chalu;
        // System.out.println(chalu + " " +khattam);
        if(clash){
            int st = Math.min(intervals.get(chalu).start, newInterval.start);
            int en = Math.max(intervals.get(khattam).end, newInterval.end);
            int count=-1;
            while(count != (khattam-chalu)){
                intervals.remove(chalu);
                count++;
            }
            intervals.add(chalu, new Interval(st, en));   
        }
        else{
            int i=0;
            int position = 0;
            Boolean added=false;
            for(; i<intervals.size(); i++){
                Interval current = intervals.get(i);
                if(!added){
                    if(newInterval.start < current.start){
                        position = ans.size();
                        ans.add(newInterval);
                        added = true;
                        i--;
                    }
                    else
                        ans.add(current);
                }
                else{
                    ans.add(current);
                }
            }
            if((i == intervals.size()) && !added)
                ans.add(newInterval);
            return ans;
        }
        return intervals;
    }
}
