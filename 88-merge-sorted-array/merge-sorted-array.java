class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = nums1.length-1;
        int  p = m-1;
        int q = n-1;
        while(q>=0){
            if( p>-1 && nums1[p]>nums2[q]){
                nums1[size--] = nums1[p]; 
                p--;
            }
            else if( q>-1 ) {
                nums1[size--] = nums2[q];
                q--;
            }
        }
    }
}