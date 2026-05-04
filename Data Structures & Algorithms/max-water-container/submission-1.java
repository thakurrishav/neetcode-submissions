class Solution {
    public int  maxArea(int[] heights) {
       int i = 0;
       int j = heights.length-1;
       int width = 0;
       int maxArea = Integer.MIN_VALUE;
       int height = 0;
       int area = 0;
       while(i<=j){
        height = Math.min(heights[i],heights[j]);
            width = j-i;
            area = height*width;
            maxArea = Math.max(maxArea,area);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
       }
       return maxArea;
    }
}
