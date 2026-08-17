class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low= 1;
        long high = Long.MAX_VALUE;

        while(low < high){
            long mid = low + (high - low) / 2;
            long t = 0;
            for(int i : time){
                t += mid / i;
                if(t > totalTrips) break;
            }
            if(t >= totalTrips){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}