class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0;i<nums.length;i++){
            nums[i] %= 2;
        }
        
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 1;
        int sum = 0 , ans = 0;

        for(int num : nums){
            sum += num;
            if(sum >= k) ans += prefixSum[sum - k];
            prefixSum[sum]++;
        }
        return ans;
    }
}