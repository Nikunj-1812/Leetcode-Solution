class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;
        for(int i =0;i<quantities.length;i++){
            high = Math.max(high,quantities[i]);
        }
        while(low < high){
            int mid = low + (high - low) /2;
            if(ifdistribute(quantities,n,mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
    public boolean ifdistribute(int[] quantities,int n ,int max){
        int store = 0;
        for(int i : quantities){
            store += (i+max-1)/max;
        }
    return store <= n;
    }
}