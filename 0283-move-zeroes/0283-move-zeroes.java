class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[idx] = nums[i];
                idx++;
            }
        }
        for(int j = idx;j<nums.length;j++){
            nums[j] = 0;
        }
    }
}