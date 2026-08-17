class Solution {
    public int minCapability(int[] nums, int k) {
        int low = 0;
        int high = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int take = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] <= mid){
                take = take + 1;
                i++;
            }
        }
        if(take >= k){
            high = mid -1;
        }else{
            low = mid + 1;
        }
        }
        return low;
    }
}