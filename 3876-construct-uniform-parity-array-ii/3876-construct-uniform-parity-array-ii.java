class Solution {
    public boolean uniformArray(int[] nums1) {
        int midOdd = Integer.MAX_VALUE;
        int midEven = Integer.MAX_VALUE;

        for(int x : nums1){
            if(x % 2 == 0) midEven = Math.min(midEven,x);
            else midOdd = Math.min(midOdd,x);
        }
        if(midOdd == Integer.MAX_VALUE) return true;

        return midOdd<midEven;
    }
}