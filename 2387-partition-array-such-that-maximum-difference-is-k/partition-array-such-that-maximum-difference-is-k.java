class Solution {
    public int partitionArray(int[] nums, int k) {
      int n  = nums.length;
      ArrayList<Integer> temp = new ArrayList<>();
      for(int  i  = 0;i<n;i++){
        temp.add(nums[i]);
      }
      Collections.sort(temp);
      int ans = 0;
      int i = 0;
      while(i<temp.size()){
        int min = temp.get(i);
        int max = temp.get(i);

        ArrayList<Integer> memp = new ArrayList<>();
       
        // for(int j  = i;j<temp.size();j++){
        // min = Math.min(min,temp.get(j));
        // max = Math.max(max,temp.get(j));
        // if((max-min)<=k){
        //     temp.remove(j);
        // }
        // }

       for(int j = i;j<temp.size();j++){
        min = Math.min(min,temp.get(j));
        max = Math.max(max,temp.get(j));
        if((max-min)<=k){
            memp.add(temp.get(j));
        }
        else{
            break;
        }
       }
       // remove the ele of the memp elemene
        int c = memp.size();
        for(int j = 0;j<memp.size();j++){
        temp.remove(i);
       }
        ans++;
      }
      return ans;
    }
}