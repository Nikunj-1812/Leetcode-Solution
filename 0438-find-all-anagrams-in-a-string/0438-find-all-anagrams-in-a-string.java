class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int c1[] = new int[26];
        int c2[] = new int[26];

        List<Integer> ans = new ArrayList<>();

        if(s.length() < p.length()) return ans;

        for(int i = 0;i<p.length();i++){
            c1[p.charAt(i)- 'a']++;
            c2[s.charAt(i)- 'a']++;
        }
        if(Arrays.equals(c1,c2)) ans.add(0);

        for(int i = p.length(); i< s.length();i++){
            c2[s.charAt(i) - 'a']++;
            c2[s.charAt(i -p.length()) - 'a']--;
            if(Arrays.equals(c1,c2)){
            ans.add(i-p.length()+1);
        }
        }

      return ans;  


    }
}