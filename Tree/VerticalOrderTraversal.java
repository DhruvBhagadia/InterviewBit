class Solution {
    ArrayList<Location> locations;
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        locations = new ArrayList();
        dfs(root, 0, 0);
        Collections.sort(locations);

        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        ans.add(new ArrayList<Integer>());

        int prev = locations.get(0).x;

        for (Location loc: locations) {
            if (loc.x != prev) {
                prev = loc.x;
                ans.add(new ArrayList<Integer>());
            }
            ans.get(ans.size() - 1).add(loc.val);
        }

        return ans;
    }

    public void dfs(TreeNode node, int x, int y) {
        if (node != null) {
            locations.add(new Location(x, y, node.val));
            dfs(node.left, x-1, y+1);
            dfs(node.right, x+1, y+1);
        }
    }
}

class Location implements Comparable<Location>{
    int x, y, val;
    Location(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }

    @Override
    public int compareTo(Location that) {
        if (this.x != that.x)
            return Integer.compare(this.x, that.x);
        else
            return Integer.compare(this.y, that.y);
    }
}