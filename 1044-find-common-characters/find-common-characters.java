class Solution {
    public List<String> commonChars(String[] words) {
     int n = words.length;
     String temp = words[0];
     HashMap<Character,Integer>mp = new HashMap<>();
       for(int i=0;i<temp.length();i++){
       mp.put(temp.charAt(i),mp.getOrDefault(temp.charAt(i),0)+1);
       } 

       for(char key : mp.keySet()){
     
        for(int i=1;i<words.length;i++){
        HashMap<Character,Integer>mp1 = new HashMap<>();
        String memp =  words[i];

        for(int j = 0;j<memp.length();j++){
        mp1.put(memp.charAt(j),mp1.getOrDefault(memp.charAt(j),0)+1);  
        }

        if(mp1.containsKey(key)  &&  mp1.get(key)>=mp.get(key)){
            continue;
        }
        else if(mp1.containsKey(key) &&  mp1.get(key)<mp.get(key)){
            mp.put(key,mp1.get(key));
        }
        else{
            mp.put(key,0);
        }

       }
       }
       ArrayList<String> ans = new ArrayList<>();
      for(char key : mp.keySet()){
      for(int i = 1;i<=mp.get(key);i++){
      ans.add(String.valueOf(key));
      }
     }
       return ans; 
    }
}