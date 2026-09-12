class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
    int n = arr.length;
    int sum = 0;
    int count = 0;
    int i = 0;
    while(i<k){
    sum+=arr[i];
    i++;
    }   
    int p = 0;
    if(sum/k>=threshold){
        count++;
    }
    for(int j = i;j<n;j++){
     sum = sum+arr[j]-arr[p];
     p++;   
     if(sum/k>=threshold){
        count++;
     }
    } 
    return count;
    }
}