class Solution {
    static int [] nse ;
      static int [] pse ;
      static Stack<Integer> st;
      static long [] prefix;
      static long [] prefix2;
      // this mathos gient eh nse of the nums that is the mosr imporant for this question

      public static int[] nse(int [] nums){
        int n = nums.length;
        for(int i = 0;i<n;i++){
        while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
            nse[st.pop()] = i;
        }
        st.push(i);
      }
      st.clear();
      return nse;
      }
     
     //  this mehtod use fir the calcilatin the pse of hr nums
      
      public static int[] pse(int [] nums){
        int n = nums.length;
        for(int i = n-1;i>=0;i--){
        while(!st.isEmpty() && nums[i]<nums[st.peek()]){
            pse[st.pop()] = i;
        }
        st.push(i);
      }
      st.clear();
      return pse;
      }
      // then find out the prefix o fhte nums

      public static long [] prefix(int [] nums){
      int n = nums.length;
      prefix[0] = 0;
      for(int i = 1;i<=n;i++){
     prefix[i] = prefix[i-1]+nums[i-1];
      }
      return prefix;
      }
      // this is the main fundtion there is the callingthe function 

    public int totalStrength(int[] strength) {
        int n = strength.length;
        nse = new int[n];
       pse = new int[n];
       java.util.Arrays.fill(nse,n);
       java.util.Arrays.fill(pse,-1);
       st = new Stack<>();

       prefix = new long [n+1];
       prefix2 = new long [n+2];
       // call teh funstion of the nse 
       nse(strength);
       //then call teh fundionof the pse
       pse(strength);
       // tehn sall teh functipn fpo the prefix calculate
       prefix(strength);
       // then cal culate the prefictow witht eh hw;p of the prefic sum
        long mod= (long)1e9+7;

       for(int i = 1;i<=n+1;i++){
       prefix2[i] = (prefix2[i-1]+prefix[i-1])%mod;
       }
      // then  make teh current ele to the minimum
      // the 
      
      long ans = 0;
    for(int i   = 0;i<n;i++){
        int left =  pse[i];
        int right = nse[i];
        long k = i-left;
        long m = right - i;
        long sum1 = (prefix2[right+1]-prefix2[i+1]+mod)%mod;
         long sum2 = (prefix2[i+1]-prefix2[left+1]+mod)%mod;
         long total = ((sum1*k)%mod-(sum2*m)%mod+mod)%mod;
         long contirbution = (total*strength[i]%mod);
         ans = (ans+contirbution)%mod;
    }
   
      return (int)ans;
    }
}