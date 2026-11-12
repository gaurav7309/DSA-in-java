class Solution {
    public String processStr(String s) {
        int n = s.length();
        String ans = "";

        StringBuilder temp = new StringBuilder();

        for(int i = 0;i<n;i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            temp.append(s.charAt(i));

        }
        else if(s.charAt(i)=='*' && temp.length()>0){
            temp.deleteCharAt(temp.length()-1);
        }
        else if(s.charAt(i)=='#'){
            temp.append(temp);
        }
        else if(s.charAt(i)=='%'){
            temp =  temp.reverse();
        }
        }
        return temp.toString();
    }
}