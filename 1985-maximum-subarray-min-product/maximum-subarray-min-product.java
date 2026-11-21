class Solution {
   static long [] prefix;// static intialization of the prefix arrat
    static int [] nse; // static intialization of the nse
    static int [] pse; // static intialization of the pse
    static Stack<Integer> st; //static intialization of the stack 
    long mod = (long)1e9 + 7;

   public static long [] prefix_Sum(int[] prefix_array){
   int n = prefix_array.length;
   prefix[0] =  0;
   for(int i = 1;i<=n;i++){
    prefix[i] = prefix[i-1]+prefix_array[i-1];
   }
   return prefix;
   }
  // creat the methos of the nse a
   
   public static int [] next_smallest_element(int [] nse_array){
    st = new Stack<>();
    int n = nse_array.length;
    java.util.Arrays.fill(nse,n);
    for(int i = 0;i<n;i++){
        while(!st.isEmpty() && nse_array[i]<nse_array[st.peek()]){
            nse[st.peek()] = i;
            st.pop();
        }
        st.push(i);
    }
    st.clear();
    return nse;
   } 
   
   // creat the methos of the pse a
   
   public static int [] previous_smallest_element(int [] pse_array){
    st = new Stack<>();
    int n = pse_array.length;
    java.util.Arrays.fill(pse,-1);
    for(int i = n-1;i>=0;i--){
        while(!st.isEmpty() && pse_array[i]<pse_array[st.peek()]){
            pse[st.peek()] = i;
            st.pop();
        }
        st.push(i);
    }
    st.clear();
    return pse;
   } 
    public int maxSumMinProduct(int[] nums) {
       int  n  = nums.length;
       prefix  = new long[n+1];
       nse = new int[n];
       pse = new int[n];
       prefix_Sum(nums);
       previous_smallest_element(nums); // for find the pse pf the currint ele
       next_smallest_element(nums); // for find the nse pf the currint ele
       
       // then apply the contibution techni\qu\e
       long max = Integer.MIN_VALUE;
       for(int i = 0;i<n;i++){
       long use = ((prefix[nse[i]]-prefix[pse[i]+1]));
       long muse = (long)(nums[i]*use);
       max = Math.max(muse,max);
       }
       return (int)(max%mod);
       //
    }
}