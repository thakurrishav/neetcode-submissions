class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
     int l = 0;
     int MinDifference = Integer.MAX_VALUE;
     int difference = 0;
     for(int r=0;r<nums.length;r++){
        if(r-l+1==k){
            difference = nums[r]-nums[l];
            MinDifference = Math.min(MinDifference , difference);
            l++;
        }
     }   
     return MinDifference;
    }
}