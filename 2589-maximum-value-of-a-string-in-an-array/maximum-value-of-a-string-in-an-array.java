class Solution {
    public int maximumValue(String[] strs) {
  
    int max = 0;
    for(String s : strs){
        boolean pd = false;
        boolean pl = false;
    for(int i = 0;i<s.length();i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            pl = true;
        }
        else {
            pd = true;
        }
    }
    if(pd==true && pl==true){
        int diff = s.length();
        max  = Math.max(max,diff);
    }
    else if(pd==true && pl==false){
        int sum = Integer.parseInt(s);
        
        max = Math.max(max,sum);
    }
    else{
        max = Math.max(max,s.length());
    }
    } 
    return max;   
    }
}