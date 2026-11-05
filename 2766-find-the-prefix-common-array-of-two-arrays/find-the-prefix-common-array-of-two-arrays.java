class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      int n = A.length;
      int[] ans = new int[n];
      ans[0] = 0;
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
      for(int i = 0;i<n;i++){
      arr1.add(A[i]);
      arr2.add(B[i]);
      // check whether the element are the presebt or n0t
      int temp = 0;
      for(int j = 0;j<arr1.size();j++){
         for(int k = 0;k<arr2.size();k++){
          if(arr1.get(j)==arr2.get(k)){
            temp++;
          }
      }
      }
      ans[i] = temp;
      }  
      return ans;
    }
}