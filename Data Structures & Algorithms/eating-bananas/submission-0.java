class Solution {

    public int solution(int[] piles, int speed){

        int sum = 0;

        for(int i = 0; i < piles.length; i++){
            sum += (piles[i] + speed - 1) / speed;
        }

        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for(int pile : piles){
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;

        while(low < high){

            int mid = (low + high) / 2;

            int ans = solution(piles, mid);

            
            if(ans <= h){
                high = mid;
            }

            
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
