class Solution {
    public String reformat(String s) {
    int n = s.length();
    int dig1 = 0;
    int alph1 = 0;
    ArrayList<Character> alph = new ArrayList<>();
    ArrayList<Character> dig = new ArrayList<>();
    for(int i = 0;i<n;i++){
    if(Character.isDigit(s.charAt(i))){
        dig1++;
        dig.add(s.charAt(i));
    }    
    else if(Character.isLetter(s.charAt(i))){
        alph1++;
        alph.add(s.charAt(i));
    }
    }
    if(Math.abs(dig1-alph1)>1){
        return "";
    }    
    else{
   
    StringBuilder  ans = new StringBuilder();
    if(alph1>dig1){
    for(int i = 0;i<alph.size();i++){
    ans.append(alph.get(i));
    if(i<dig.size()){
    ans.append(dig.get(i));  
    }  
    }
    return ans.toString();
    }
    else{
        for(int i = 0;i<dig.size();i++){
          ans.append(dig.get(i));
          if(i<alph.size()){
          ans.append(alph.get(i));  
          }  
        }
        return ans.toString();
    }
    }
    
    }
}