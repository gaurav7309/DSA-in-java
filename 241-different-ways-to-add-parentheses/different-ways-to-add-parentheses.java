class Solution {
   public static List<Integer> solve(String s){
     List<Integer> ans  =  new ArrayList<>();
     for(int i = 0;i<s.length();i++){
        if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'){
        List<Integer> left_string = solve(s.substring(0,i));
        List<Integer> right_string  = solve(s.substring(i+1));
        
        for(int left:left_string){
          for(int right:right_string){
            if(s.charAt(i)=='+'){
               ans.add(left+right); 
            }
            else if(s.charAt(i)=='-'){
               ans.add(left-right); 
            }
            else if(s.charAt(i)=='*'){
               ans.add(left*right); 
            }
        }  
        }
        }
       
     }
      if(ans.isEmpty()){
            ans.add(Integer.parseInt(s));
        }  
return ans;
    }
    public List<Integer> diffWaysToCompute(String s) {
      return   solve(s);
    }
}