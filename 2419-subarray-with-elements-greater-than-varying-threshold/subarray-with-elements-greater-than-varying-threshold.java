class Solution {
    static int [] nse; // intilize the static nezt smallest ele
    static int [] pse; // intilize the static pre smallest ele
    static Stack<Integer> st; // intilize the static stack
    // methos that give us the nse(next smallest ele) array
    public static int [] next_smallest_ele(int[] nums){
        int n = nums.length;
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
            nse[st.peek()] = i;
            st.pop();

            }
            st.push(i);
        }
        st.clear(); // so that the nezt time we can use this
        return nse;
    }

     // method that give us the pse(previous smallest ele) array
    public static int [] previous_smallest_ele(int[] nums){
        int n = nums.length;
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
            pse[st.peek()] = i;
            st.pop();

            }
            st.push(i);
        }
        st.clear(); // so that the nezt time we can use this
        return pse;
    }

    public int validSubarraySize(int[] nums, int threshold) {
    int n = nums.length;
    pse   = new int[n];
    nse = new int[n];
    st = new Stack<>();
    java.util.Arrays.fill(pse,-1); // intilize with the -1 
    java.util.Arrays.fill(nse,n);// intilize with the size of the arrar(n)
    previous_smallest_ele(nums);
    next_smallest_ele(nums);
    //main logic that requires teh pse && nse
    
    for(int i = 0;i<n;i++){
       
        int len = nse[i]-pse[i]-1; // calcularte the length of the that subarray
        int check = threshold/len;
        // if(nse[i]!=n && pse[i]!=-1){
        if(check<nums[i]){
            return len;
        // }
        }
        }
    
    return -1;


    }
}