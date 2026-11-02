class Solution {
         public static boolean ispalidrome(String par){
         String rev = new StringBuilder(par).reverse().toString();
         return rev.equals(par);
         }
    public static void get_par(String s , ArrayList<String> partition, List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(partition));
        }
      
         for(int i = 0;i<s.length();i++){
         String par = s.substring(0,i+1);
         if(ispalidrome(par)){
          partition.add(par);
          get_par(s.substring(i+1),partition,ans);
          partition.remove(partition.size()-1);
         }
         }
    }
    public List<List<String>> partition(String s) {
        int n   = s.length();
        ArrayList<String> partition = new ArrayList<>();
         List<List<String>> ans = new ArrayList<>();
         get_par(s,partition,ans);
         return ans;
    }
}