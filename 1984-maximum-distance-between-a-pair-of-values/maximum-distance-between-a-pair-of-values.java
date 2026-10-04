class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
     int n = nums1.length;
     int m = nums2.length;
     int max = 0;
     for(int i = 0;i<n;i++){
        int left = i;
        int right = m-1;
        while(left<=right){
            int mid = left+(right-left)/2;

            if(nums1[i]<=nums2[mid]){
                int diff = mid-i;
                max = Math.max(max,diff);
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
     }   
     return max;
    }
}