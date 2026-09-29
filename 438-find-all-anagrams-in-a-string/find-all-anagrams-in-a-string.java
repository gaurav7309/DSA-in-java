class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    int n = s.length();
    int m = p.length();
    ArrayList<Integer> arr = new ArrayList<>();
    if(n<m){
        return arr;
    }
    HashMap<Character,Integer>pm = new HashMap<>();
    for(int i = 0;i<m;i++){
    pm.put(p.charAt(i),pm.getOrDefault(p.charAt(i),0)+1);
    }

    HashMap<Character,Integer>mp = new HashMap<>();
 
    for(int i = 0;i<m;i++){
    mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
    }  
     boolean flag = true;
     for(int i = 0;i<m;i++){
     if(!mp.containsKey(p.charAt(i)) || !mp.get(p.charAt(i)).equals(pm.get(p.charAt(i)))){
     flag = false; 
     break;
     }
    }    
    if(flag){
        arr.add(0);
    }
    // next check one by one ech iteration
    // p coverted into the hashmap
    
    int p1 = 0;
    for(int i = 1;i<=n-m;i++){
    flag = true;
    char temp = s.charAt(p1++);
    mp.put(s.charAt(i + m - 1),mp.getOrDefault(s.charAt(i + m - 1),0)+1);
    mp.put(temp,mp.getOrDefault(temp,0)-1);  
    // agiain check whether the string has the anagram or not
    for(int j = 0;j<m;j++){
     if(!mp.containsKey(p.charAt(j)) ||  !mp.get(p.charAt(j)).equals(pm.get(p.charAt(j))) ){
     flag = false; 
     break;
     }
    }
    if(flag){
        arr.add(i);
    }

    }
    return arr;
    }
}