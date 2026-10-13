class Solution {
    public int findLength(int[] nums1, int[] nums2) {
     int n = nums1.length;
     int m = nums2.length;
     int max = 0;
     for(int i = 0;i<n;i++){
        for(int l = 0;l<m;l++){
            int c = 0;
            int j = i;
            int k = l;
            while(j<n && k<m && nums1[j]==nums2[k]){
                c++;
               
                max = Math.max(max,c);
                k++;
                j++;
            }
        }
     }
     return max;
    }
}