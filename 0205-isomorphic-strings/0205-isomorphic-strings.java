class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] smap = new int[256];
        int[] tmap = new int[256];

        for(int i =0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(smap[c1] != tmap[c2]) return false;
            smap[c1] = i+1;
            tmap[c2] = i+1;
        }
        return true;
        
    }
}