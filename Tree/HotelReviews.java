//https://www.interviewbit.com/problems/hotel-reviews/

public class Solution {
    class TrieNode{
        HashMap<Character, TrieNode> map;
        Boolean end;
    
        TrieNode(Boolean assign){
            map = new HashMap<Character, TrieNode>();
            end = assign;
        }
    }
    
    class Pair implements Comparable<Pair>{
        int index;
        int count;
        Pair(int index, int count){
            this.index = index;
            this.count = count;
        }
        @Override
        public int compareTo(Pair p){
            return Integer.compare(this.count, p.count);
        }
    }
    
    class Trie{
        TrieNode root = new TrieNode(false);
    
        void insert(String str){
            TrieNode ptr = root;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                Boolean end = false;
                if(i == str.length()-1)
                    end = true;
                if(ptr.map.containsKey(ch))
                    ptr = ptr.map.get(ch);
                else{
                    TrieNode node = new TrieNode(end);
                    ptr.map.put(ch, node);
                    ptr = node;
                }
            }
        }
    
        Boolean search(String str){
            TrieNode ptr = root;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(!ptr.map.containsKey(ch))
                    return false;
                else
                    ptr = ptr = ptr.map.get(ch);
            }
            if(ptr.end)
                return true;
            else
                return false;
        }
    }
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        ArrayList<Pair> a = new ArrayList<Pair>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<B.size(); i++){
            Trie trie = new Trie();
            int count = 0;
            String[] str = B.get(i).split("_");
            for(String s: str)
                trie.insert(s);
            str = A.split("_");
            for(String s: str)
                if(trie.search(s))
                    count++;
            a.add(new Pair(i, count));
        }
        Collections.sort(a, Collections.reverseOrder());
        for(int i=0; i<a.size(); i++)
            ans.add(a.get(i).index);
        return ans;
    }
}
