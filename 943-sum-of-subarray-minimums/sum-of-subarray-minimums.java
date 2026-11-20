class Solution {
    public int sumSubarrayMins(int[] arr) {
       int n = arr.length;
       // find out the min array rhar is called the pse
       long mod=1000000007;
       int [] pse = new int[n];
       Stack<Integer> st = new Stack<>();

       int [] nse = new int[n];

       java.util.Arrays.fill(pse,-1);
       java.util.Arrays.fill(nse,n); 
   /// for finding the  pse
       for(int i = n-1;i>=0;i--){
       while(!st.isEmpty() && arr[i]<arr[st.peek()]){
        pse[st.peek()] = i;
        st.pop();
       }
       st.push(i);
       }
       st.clear();

 /// for finding the  nse
       for(int i = 0;i<n;i++){
       while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
        nse[st.peek()] = i;
        st.pop();
       }
       st.push(i);
       }
       // check weather the that ele are the where where is the min it tells  howmany subarray there this ele are the minumin
       long ans = 0;
       for(int i = 0;i<n;i++)
{
      long use =(nse[i]-i)*(i-pse[i])%mod;
    //   ans+=use%mod;
    ans=(ans+arr[i]*use)%mod;
}
return (int)ans;    
}
}