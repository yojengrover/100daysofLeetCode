import java.util.*;
class Solution {
    
    
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        addSubs(0, nums, sol, ans);
        return ans;
    }

    public void addSubs(int f, int[] nums, List<Integer> sol, List<List<Integer>> ans){
        ans.add(new ArrayList(sol));
        for(int i = f; i<nums.length; i++){
        sol.add(nums[i]);
        addSubs(i+1, nums, sol, ans);
        sol.remove(sol.size() - 1);
        }

    }
}