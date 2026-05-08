class Solution {
    public int minimumRecolors(String blocks, int k) {
       int left = 0; 
       int MIN = Integer.MAX_VALUE;
        int min = 0;
       for(int right = 0;right<blocks.length();right++){
        if(blocks.charAt(right)=='W'){
            min++;
        }
        if(right-left+1==k){
            MIN = Math.min(min,MIN);
           if(blocks.charAt(left) == 'W'){
                    min--;
                }
                left++;
        }
       }
       return MIN;
    }
}