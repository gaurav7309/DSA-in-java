class Solution {
    public int[] decrypt(int[] code, int k) {
     int n = code.length;
     int [] rev = new int[n];
     for(int i = 0;i<n;i++){
       if(k==0){
        rev[i] = 0;
       } 
       else if(k>0){
        int sum = 0; int p = 0; int  t1 = i+1;
        while(p<k){
            sum+=code[t1%n];
            p++;
            t1++;

        }
        
        rev[i] = sum;
       }
       else{
           int sum = 0; int p = 0; int  t1 = i-1;
        while(p<Math.abs(k)){
            sum+=code[(n+t1)%n];
            p++;
            t1--;
        } 
         rev[i] = sum;
        }
     }   
     return rev;
    }
}