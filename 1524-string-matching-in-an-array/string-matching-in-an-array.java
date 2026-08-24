class Solution {
    public List<String> stringMatching(String[] words) {
     int n = words.length;
     ArrayList<String> arr = new ArrayList<>();
     for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            if(j!=i){
         if(words[j].contains(words[i])){
         arr.add(words[i]);
         break;
         }
        }
        }
     } 
     return  arr; 
    }
}