class Solution {

    boolean Binary(int n,int k){
        
    int c = 0;
    while(n!=0){
        if(n%2==1){
            c++;
        }
        n/=2;
    }
    if(c==k){
    return true;
    }
    else{
        return false;
    }
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
      int n =  nums.size();
      int sum = 0;
      for(int i =  0;i<n;i++){
     boolean temp =  Binary(i,k);
     if(temp==true){
     sum+=nums.get(i);
     }
     else{
        continue;
     }
      }
      return sum;
    }
}