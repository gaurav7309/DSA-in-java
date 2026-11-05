class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> ans = new ArrayList<>();
        int[] visited = new int[n];

        for(int i = 0; i < n; i++){
            if(visited[i] == 1){
                continue;
            }

            ArrayList<Integer> temp = new ArrayList<>();

            for(int j = 0; j < n; j++){
                if(groupSizes[i] == groupSizes[j] && visited[j] != 1){
                    temp.add(j);
                    visited[j] = 1;
                }

                if(temp.size() == groupSizes[i]){
                    break;
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}