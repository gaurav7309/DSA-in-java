class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x-1;
        if(x==1){
            return 1;
        }
        while(low<=high){
        int mid = low+(high-low)/2;
        if((long)mid*mid==x){
            return mid;
        }
         else if((long)mid*mid<x && (long)(mid+1)*(mid+1)>x){
           return mid;
        }
        else if((long)mid*mid<x){
        low = mid+1;
        }
        else{
            high = mid-1;
        }
       
     }
    return 0;
    }
}