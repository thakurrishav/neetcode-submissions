class Solution {
   public int find(int[] nums,int target){
    int low = 0;
    int high = nums.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return -1;
   }
    public int searchInsert(int[] nums, int target) {
       int index = find(nums,target);
       if(index!=-1){
        return index;
       }
       int low = 0;
       int high = nums.length-1;
       while(low<=high){
        int mid = (low+high)/2;
        if(nums[mid]<target){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
       }
       return low;
    }
}