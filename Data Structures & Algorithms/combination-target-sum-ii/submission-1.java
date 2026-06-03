class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        solve(0,new ArrayList<>(),candidates,target,0);

        return ans;
    }

    void solve(int idx,List<Integer> curr,
               int[] nums,int target,int sum){

        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(sum>target){
            return;
        }

        for(int i=idx;i<nums.length;i++){

            if(i>idx && nums[i]==nums[i-1])
                continue;

            curr.add(nums[i]);

            solve(i+1,curr,nums,target,sum+nums[i]);

            curr.remove(curr.size()-1);
        }
    }
}