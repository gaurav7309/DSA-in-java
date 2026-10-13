class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

       // BRUTE FORCE APPROACH

    //   int n  = queries.length;
    //   int[] ans = new int[n];
    //   int k = 0;
    //   for(int[] query : queries){
    //     int temp = 0;
    //     for(int i = query[0];i<=query[1];i++){
    //      temp^=arr[i];
    //     }
    //     ans[k++] = temp;
    //   }
    //    return ans; 
    int n = arr.length;
    int [] prefix = new int[n];
    prefix[0] = arr[0];

    for(int i = 1;i<n;i++){
    prefix[i] = prefix[i-1]^arr[i];
    }
    int[] ans = new int[queries.length];
    int k = 0;
    for(int [] query: queries){
            if(query[0] == 0){
            ans[k++] = prefix[query[1]];
            }
            else{
            ans[k++] = prefix[query[1]]^prefix[query[0]-1];
            }
    }
    return ans;
    }
}