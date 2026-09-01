class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
    }
    int f(int[] a,int k){
        int i=0,j=0;
        int x=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        while(j<a.length){
            if(m.containsKey(a[j])){
                m.put(a[j],m.get(a[j])+1);
            }
            else{
                m.put(a[j],1);
            }
            while(m.size()>k){
                m.put(a[i],m.get(a[i])-1);
                if(m.get(a[i])==0){
                     m.remove(a[i]);
                }
                i++;
            }
            x+=(j-i+1);
            j++;
        }
        return x;
    }
}