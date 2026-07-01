class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> x =new HashSet<>();
        List<Integer> y = new ArrayList<>();

        for(int num:nums){
            if(!x.contains(num)){
                x.add(num);
            }else{
                y.add(num);
            }
        }

        int[] ans = new int[y.size()];
        for(int i = 0;i<y.size();i++){
            ans[i] = y.get(i);
        }
        return ans;
    }
}