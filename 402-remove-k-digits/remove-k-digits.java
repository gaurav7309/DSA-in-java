class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Integer> st = new Stack<>();
       int [] nums = new int[n];
      for(int i  = 0;i<n;i++){
        nums[i] = num.charAt(i)-'0';
      }

        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && k!=0 && st.peek()>nums[i]){
                st.pop();
                k--;
            }
            st.push(nums[i]);
        }
        while(!st.isEmpty() && k!=0){
            st.pop();
            k--;
        }

// then relrad that arrat int the striug
    StringBuilder ans = new StringBuilder();
    while(!st.isEmpty()){
        ans  = ans.append(st.pop());
    }
    ans.reverse();
    //nthen we have to remove  for=m th fonr of the string
    int i = 0;
    if(ans.length()>0 && ans.charAt(0)=='0'){
    for(;i<ans.length();){
        if(ans.charAt(i)=='0'){
           ans =  ans.deleteCharAt(i);
        }
        
        else{
            break;
        }
       

    }
    }
    
   String ans10 = ans.toString();
    return  ans10.isEmpty()?"0":ans10;
        }
}