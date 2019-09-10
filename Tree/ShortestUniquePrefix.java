//https://www.interviewbit.com/problems/shortest-unique-prefix/

public class Solution {
    class TrieNode{
        HashMap<Character, TrieNode> map;
        HashMap<Character, Integer> occ;
        Boolean end;
    
        TrieNode(Boolean assign){
            map = new HashMap<Character, TrieNode>();
            occ = new HashMap<Character, Integer>();
            end = assign;
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
                if(ptr.map.containsKey(ch)){
                    Integer j = ptr.occ.get(ch);
                    ptr.occ.put(ch, j+1);
                    ptr = ptr.map.get(ch);
                }
                else{
                    TrieNode node = new TrieNode(end);
                    ptr.map.put(ch, node);
                    ptr.occ.put(ch, 1);
                    ptr = node;
                }
            }
        }
        
        String prefix(String str){
            StringBuilder strb = new StringBuilder();
            TrieNode ptr = root;
            for(int i=0; i<str.length(); i++){
                char current = str.charAt(i);
                strb.append(Character.toString(current));
                if(ptr.occ.get(current) == 1)
                    break;
                ptr = ptr.map.get(current);
            }
            return strb.toString();
        }
        
    }
    
    public ArrayList<String> prefix(ArrayList<String> A) {
        ArrayList<String> ans = new ArrayList<String>();
        Trie trie = new Trie();
        
        for(int i=0; i<A.size(); i++)
            trie.insert(A.get(i));
        for(int i=0; i<A.size(); i++)
            ans.add(trie.prefix(A.get(i)));
        return ans;
    }
}
