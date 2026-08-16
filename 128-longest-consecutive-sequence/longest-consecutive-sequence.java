class Solution {
    public int longestConsecutive(int[] nums) {
     
    TreeSet<Integer> set = new TreeSet<>();
    int n = nums.length;
    if(n==0){
        return 0;
    }
    for(int i = 0;i<n;i++){
    set.add(nums[i]);
    }
    int m = set.size();
    int [] arr = new int[m];
    int p = 0;
    for(int ele :set ){
        arr[p++] = ele;
    }
    int min = arr[0];
    int c = 1;
    int max = 1;
    for(int i = 1;i<m;i++){
        if(min+1==arr[i]){
            min = arr[i];
            c++;
        }
        else{
         c = 1;
         min = arr[i];
         }
         max = Math.max(max,c);
    }
return max;
    }
}