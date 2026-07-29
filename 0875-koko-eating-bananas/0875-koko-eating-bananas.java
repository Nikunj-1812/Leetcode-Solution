class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        for(int pile : piles) right = Math.max(right, pile);
        int ans = right;

        while(left <= right){
            int mid = left + (right- left)/2;
            int hr = 0;
            for(int i : piles) hr += Math.ceil((double)i/mid);

            if(hr <= h){
                 right = mid - 1;
                 ans = mid;
            } 
            else left = mid + 1;
     
        }
        return ans;
    }
}