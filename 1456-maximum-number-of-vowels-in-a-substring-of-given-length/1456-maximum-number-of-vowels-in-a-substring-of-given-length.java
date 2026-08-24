class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'i' || c == 'e' || c == 'o' || c =='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int max = 0;
        int left = 0;
        int vowel = 0;

        for(int i =0;i<s.length();i++){
            if(isVowel(s.charAt(i))) vowel++;
            if(i-left+1 == k){
                max = Math.max(max,vowel);
                if(isVowel(s.charAt(left))) vowel--;
                left++;
            }
        }
    return max;       
        
    }
}