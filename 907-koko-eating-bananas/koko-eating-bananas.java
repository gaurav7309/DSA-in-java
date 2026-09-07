class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length;
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<n;i++){
        if(max<piles[i]){
            max = piles[i];
        }
    }
    int start = 1;
    int end = max;
    while(start<end){
    int mid = start+(end-start)/2;
    int tot = 0;
    for(int i = 0;i<n;i++){
    tot+=Math.ceil((double)piles[i]/mid);
    }
    if(tot<=h){
       end = mid;
    }
    else {
       start = mid+1;
    }

    }   
    return start;
    }
}