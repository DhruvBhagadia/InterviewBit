//https://www.interviewbit.com/problems/gray-code/

public class Solution {
    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<StringBuilder> g = new ArrayList<StringBuilder>();
        g.add(new StringBuilder("0"));
        g.add(new StringBuilder("1"));
        ArrayList<StringBuilder> r = new ArrayList<StringBuilder>();
        for(int i=g.size()-1; i>=0; i--)
            r.add(new StringBuilder(g.get(i)));
        for(int j=1; j<a; j++){
            for(int i=0; i<g.size(); i++)
                g.get(i).insert(0, "0");
            for(int i=0; i<r.size(); i++)
                r.get(i).insert(0, "1");
            g.addAll(r);
            r = new ArrayList<StringBuilder>();
            for(int i=g.size()-1; i>=0; i--)
                r.add(new StringBuilder(g.get(i)));
        }
        for(int i=0; i<g.size(); i++)
            ans.add(Integer.parseInt(g.get(i).toString(), 2));
        return ans;
    }
}
