class Solution {
    public boolean halvesAreAlike(String s) {
        int left = 0;
        int right = s.length()-1;
        int mid = s.length()/2;

        String x = s.substring(0,mid);
        String y = s.substring(mid);

        int count1 = 0;
        int count2 =0;

        String vowels = "aeiouAEIOU";

        for(int i =0;i<x.length();i++){
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            count1++;
                }
        }
        for(int j =0;j<y.length();j++){
            char ch = y.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            count2++;
                }
        }
        return count1 == count2;

    }
}