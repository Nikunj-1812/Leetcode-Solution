class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int res = 0,max=0;
        int maxFreq = 0;
        for(int i =0;i<s.length();i++){
            arr[s.charAt(i) - 'A']++;
            max = Math.max(max,arr[s.charAt(i) - 'A']);

            if(i- maxFreq + 1 - max > k){
                arr[s.charAt(maxFreq) - 'A']--;
                maxFreq++;
            }
            res = Math.max(res , i - maxFreq + 1);
        }
        return res;

    }
}