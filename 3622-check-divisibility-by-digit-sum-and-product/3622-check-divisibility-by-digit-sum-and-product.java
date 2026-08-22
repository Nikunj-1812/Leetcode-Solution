class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum =0;
        int pro = 1;
        int num = n;
    

        while(num > 0){
            int dig = num %10;
            sum += dig;
            pro *= dig;
            num /= 10;
        }
        int tsum = sum + pro;
        return n%tsum == 0;
    }
}