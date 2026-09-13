class Solution {
    public List<String> summaryRanges(int[] nums) {
    int n = nums.length;
   
    ArrayList<String> ans = new ArrayList<>();
    for(int i = 0;i<n;i++){
    int p1 = nums[i];
    int prev = nums[i];
    for(int j = i+1;j<n;j++){
    if(prev+1==nums[j]){
        prev = nums[j];
        i = j;
    }   
    else{
        break;
    }
   

    }
    
    if(p1!=prev){
    ans.add((p1+"->"+prev));
    }
    else{
        ans.add((Integer.toString(p1)));
    }
    }   
    return ans; 
    }
}