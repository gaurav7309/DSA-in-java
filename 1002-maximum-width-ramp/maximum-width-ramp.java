class Solution {
    public int maxWidthRamp(int[] nums) {
        int n  = nums.length;
        Stack<Integer> drecrement_stack = new Stack<>();
       
        drecrement_stack.push(0);

        for(int i = 1;i<n;i++){

        // while(!drecrement_stack.isEmpty() && nums[i]<=nums[st.peek()]){
        //     st.push()
        // }  
        if(nums[i]<=nums[drecrement_stack.peek()]){
        drecrement_stack.push(i);
        }
         
        }
        // then cjech whether the current last ele is teh if teh greater than the present peek ele of teh stack then find out the mas ans 
        int q = n-1;
        int max = Integer.MIN_VALUE;
        while(!drecrement_stack.isEmpty() && q>=0){
            if(drecrement_stack.peek()<=q){
            if(nums[drecrement_stack.peek()]<=nums[q]){
              max =  Math.max(max,q-drecrement_stack.peek());  
              drecrement_stack.pop();
            }
            else{
                q--;
            }

            }
            else{
                  break;
            }
            
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}