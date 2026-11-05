class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       int n = arr1.length;
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       int c= 0;
       for(int i = 0;i<n;i++){
        boolean falg = true;
        for(int j = 0;j<arr2.length;j++){
            if(Math.abs(arr1[i]-arr2[j])<=d){
                falg = false;
                
            }
             
        }
       if(falg){
        c++;
       }
       }
       return  c;
       
    }
}