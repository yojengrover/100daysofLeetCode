class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        combo(n,sol, ans, 1, k);
        return ans;
    }

    public  void combo(int n, List<Integer> sol,List<List<Integer>> ans, int f, int k)   {
        if(sol.size() == k){
            ans.add(new ArrayList(sol));
            return;
        }
        for(int i = f; i<=n; ++i){
            sol.add(i);
            combo(n,sol,ans,i+1,k);
            sol.remove(sol.size() - 1);
        }

    }
}