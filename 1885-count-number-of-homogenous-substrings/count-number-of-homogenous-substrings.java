class Solution {
    public int countHomogenous(String s) {
        int n = s.length();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int temp1 = 0;
            char temp = s.charAt(i);
            int j = i;
            boolean flag = true;
          while(flag && j<n){
            if(temp==s.charAt(j)){
            temp1++;
            j++;
            }
            else{
             flag = false;
            }
            
          }  
           i = j-1;
          if(temp1!=0){
          arr.add(temp1);
          }
   
        }
        long f = 0;
        for(int i = 0;i<arr.size();i++){
            int temp = arr.get(i);
            long sum = 0;
            while(temp!=0){
            sum+= temp--;
          
            }
        f=(f+sum)%1000000007;
        }
        return (int)f;
    }
}