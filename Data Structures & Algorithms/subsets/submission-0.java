class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       solve(0,nums,new ArrayList<>());
       return ans; 
    }
    void solve(int idx,int[] nums,List<Integer>curr){
        ans.add(new ArrayList<> (curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            solve(i+1,nums,curr);
            curr.remove(curr.size()-1);
        }
    }
}
