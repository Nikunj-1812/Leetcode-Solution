class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return Collections.emptyList();
        String[] phone_map  = {"abc" , "def", "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        List<String> op = new ArrayList<>();
        backtrack("" , digits,phone_map,op);
        return op;
    }
    private void backtrack(String comb , String nxt_dig , String[] ph_mp, List<String> op){
        if(nxt_dig.isEmpty()) op.add(comb);
        else{
            String lett = ph_mp[nxt_dig.charAt(0) - '2'];
            for(char let: lett.toCharArray()){
                backtrack(comb + let , nxt_dig.substring(1),ph_mp,op);
            }
        }
    }
}