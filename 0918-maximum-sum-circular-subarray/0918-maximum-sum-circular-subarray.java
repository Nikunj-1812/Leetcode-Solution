class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmin = nums[0] , currmax = nums[0] , totalsum = nums[0] , minsum = nums[0] , maxsum = nums[0] ;

        for(int i = 1;i<nums.length;i++){
            currmax = Math.max(nums[i] , currmax + nums[i]);
            maxsum = Math.max(maxsum, currmax);

           currmin = Math.min(nums[i], currmin + nums[i]);
            minsum = Math.min(minsum , currmin);

            totalsum += nums[i];
        }
        if(minsum == totalsum) return maxsum;
        return Math.max(maxsum , totalsum - minsum);
    }
}