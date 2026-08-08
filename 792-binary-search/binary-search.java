class Solution {
    public int search(int[] nums, int target) {
     return binary(nums,target,0,nums.length-1);  
    }
    public static int binary(int [] arr,int target,int low,int high) {
   
    if(low>high){
        return -1;
    }
    int mid = low+(high-low)/2;
     if(arr[mid]==target){
        return mid;
     }
     else if(arr[mid]>target){
       return binary(arr,target,low,mid-1);
     }
      else{
       return binary(arr,target,mid+1,high);
     }
     
    }
}