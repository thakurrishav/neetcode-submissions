class Solution {

    public int solution(int[] piles, int mid) {

        int sum = 0;

        for(int i = 0; i < piles.length; i++) {
            sum += (piles[i] + mid - 1) / mid;
        }

        return sum;
    }

    public int minEatingSpeed(int[] piles, int h){
        int low = 1;
        int high = 0;

for(int i = 0; i < piles.length; i++){
    high = Math.max(high, piles[i]);
}
        while(low <= high){

            int mid = (low + high) / 2;

            int ans = solution(piles, mid);

            if(ans <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
