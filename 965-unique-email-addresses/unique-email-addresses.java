class Solution {
    public int numUniqueEmails(String[] emails) {
     int n = emails.length;
     HashSet<String> st = new HashSet<>();
     for(int i = 0;i<n;i++){
        String temp = emails[i];
        String ans = "";
        for(int j = 0;j<temp.length();j++){
        if(temp.charAt(j)=='@'){
            ans+=temp.substring(j);
            break;
        }
        else if(temp.charAt(j)=='+'){
            while(temp.charAt(j)!='@'){
            j++;
           
            }
               ans+=temp.substring(j);
               break;
        }
        else if(temp.charAt(j)!='.'){
        ans+=temp.charAt(j);

        }
     
        }
        st.add(ans);
     }  
     return st.size(); 
    }
}