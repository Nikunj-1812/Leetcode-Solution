class Solution {
    public int maxDepth(String s) {
        int ans = 0 , count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count += 1;
            }else if(ch == ')'){
                count -=1;
            }
            ans = Math.max(ans,count);
        }   
        return ans;
    }
}