class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        for(int num : nums){
           low = Math.max(num,low);
           high += num;
        }
        while(low < high){
            int mid = low + (high - low) /2;
            if(cansplit(nums, k,mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
            return low;
    }
    
    public boolean cansplit(int[] nums , int k ,int maxsum){
        int count = 1;
        int sum =0;
        for(int num:nums){
            if(sum + num > maxsum){
                count++;
                sum = num;
                if(count>k) return false;
            }else sum += num;
        }
        return true;

    }
}