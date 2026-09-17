class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    ArrayList<Boolean>  ans = new ArrayList<>();

    int n = nums.length;
    int m = l.length;
  
    
    for(int i = 0;i<m;i++){
    ArrayList<Integer> temp = new ArrayList<>();    
    for(int j = l[i];j<=r[i];j++){
    temp.add(nums[j]);
    }  
    Collections.sort(temp);
    boolean flag = true;
      int t = 0;
    if(temp.size()>=2){   
     t = Math.abs(temp.get(0)-temp.get(1));
     }
    for(int k = 1;k<temp.size()-1;k++){
      
     
     if(t!= Math.abs(temp.get(k)-temp.get(k+1))){
    
     flag = false;
     break;
     } 
    }
    if(flag){
        ans.add(true);
    }
    else{
      ans.add(false);   
    }
    }
       return ans; 
    }
}