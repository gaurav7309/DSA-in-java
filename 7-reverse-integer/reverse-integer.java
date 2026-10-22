class Solution {
    public int reverse(int x) {
     
     long temp = Math.abs((long)x);
     boolean flag = true;
     if(x==temp){
        flag = true;
     }
     else{
        flag = false;
     }

     ArrayList<Integer> arr = new ArrayList<>();
     long x1 = Math.abs((long)x);
      while(x1!=0){
      arr.add((int)(x1%10));
      x1/=10;
      }
     long sum = 0;
     for(int i = 0;i<arr.size();i++){
        sum = (long)sum*10+arr.get(i);
     }
     if(flag){
        if(sum>Integer.MAX_VALUE) return 0;
        return (int)sum;
     }
     else{
        if(-sum<Integer.MIN_VALUE) return 0;
        return (int)-sum;
     
}

    }
}