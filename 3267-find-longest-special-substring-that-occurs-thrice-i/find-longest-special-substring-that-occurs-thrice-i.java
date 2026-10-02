class Solution {
    public int maximumLength(String s) {
     int n  = s.length();
     HashMap<String,Integer>mp = new HashMap<>();

     for(int i  = 0;i<n;i++){
        String temp = "";
        for(int j = i;j<n;j++){
        if(temp.length() > 0 && temp.charAt(0) != s.charAt(j)){
        break;
        }
        temp = temp+s.charAt(j);
        mp.put(temp,mp.getOrDefault(temp,0)+1);

        }
     } 
       // find out the such as the key ans the pair which is the largest as campare to other and the whose occurences is at least 3
       int max  = Integer.MIN_VALUE;
       for(String key:mp.keySet()){
       if(mp.get(key)>=3){
       String z = key;
       max = Math.max(max,z.length());
       }
       }
       return max==Integer.MIN_VALUE?-1:max;
    }
}