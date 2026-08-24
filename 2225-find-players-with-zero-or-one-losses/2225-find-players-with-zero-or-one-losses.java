class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< matches.length;i++){
            map.putIfAbsent(matches[i][0],0);
            map.put(matches[i][1], map.getOrDefault(matches[i][1],0) + 1);
        }

        List<Integer> win = new ArrayList<>();
        List<Integer> onelose = new ArrayList<>();


        for(int j : map.keySet()){
            if(map.get(j) == 0){
                win.add(j);
            }
            else if(map.get(j) == 1){
                onelose.add(j);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();

        Collections.sort(win);
        Collections.sort(onelose);
        ans.add(win);
        ans.add(onelose);
        return ans;
    }
}