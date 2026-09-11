class Solution {
    public int findChampion(int[][] grid) {
     int n = grid.length;
     HashMap<Integer,Integer> mp = new HashMap<>();
    
     for(int i = 0;i<n;i++){
        int one = 0;
        for(int j = 0;j<n;j++){
        if(i!=j){
        if(grid[i][j]==1){
            one++; 
            
        }
        }
        }
        mp.put(i,one);
     }  
     // find out the string health
      int team = 0;
      int max = 0;
     for(int key: mp.keySet()){
        if(max < mp.get(key)){
        max = mp.get(key);
        team = key;
        }
     }
     return team;
    }
}