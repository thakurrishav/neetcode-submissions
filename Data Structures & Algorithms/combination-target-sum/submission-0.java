class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0, candidates, new ArrayList<>(), target, 0);
        return ans;
    }

    void solve(int idx, int[] nums, List<Integer> curr,
               int target, int sum) {

        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(sum > target || idx >= nums.length){
            return;
        }

        
        curr.add(nums[idx]);
        solve(idx, nums, curr, target, sum + nums[idx]);

        
        curr.remove(curr.size() - 1);

       
        solve(idx + 1, nums, curr, target, sum);
    }
}
