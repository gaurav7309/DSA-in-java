class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
      long [] prefix  = new long[candiesCount.length];
      int n = candiesCount.length;
      prefix[0]  = candiesCount[0];
      for(int i = 1;i<n;i++){
      prefix[i] = prefix[i-1] + candiesCount[i];
      } 
      boolean [] ans = new boolean[queries.length];
      int i = 0;
      for(int [] query: queries){
        int fev_type = query[0];
        long fev_day = query[1];
        long daily_cap = query[2];
        long tot = fev_type==0 ? 0 : prefix[fev_type-1]; 
        if((fev_day+1)*daily_cap<=tot){
            ans[i] = false;
        }
        else if((fev_day+1)>prefix[fev_type]){
            ans[i] = false;
        }
        else{
            ans[i] = true;
        }
        i++;
      }
return ans;
    }
}