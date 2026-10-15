class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    //   int  n  = strs.length;
    //   List<List<String>> ans = new ArrayList<>();
    //   boolean[] visited = new boolean[n];
    //   for(int i = 0;i<n;i++){
    //    if(visited[i]){
    //     continue;
    //    }
    //    char [] temp = strs[i].toCharArray(); 
    //    Arrays.sort(temp);
    //    String  memp = new String(temp);

    //    ArrayList<String> brr = new ArrayList<>();
    //   for(int j = i;j<n;j++){
    //   char[] zemp = strs[j].toCharArray();
    //   Arrays.sort(zemp);
    //   String vemp  = new String(zemp);
    //   if(memp.equals(vemp)){
    //     brr.add(strs[j]);
    //     visited[j] = true; 
    //   }
    //   }  
    //   ans.add(brr);
    //   }
    //   return ans;

    HashMap<String,List<String>>mp = new HashMap<>();
    for(int i = 0;i<strs.length;i++){
        char [] temp = strs[i].toCharArray();
        Arrays.sort(temp);
        String memp = new String(temp);
        if(!mp.containsKey(memp)){
            mp.put(memp,new ArrayList<>());
        }
        mp.get(memp).add(strs[i]);
    }
    return new ArrayList<>(mp.values());
    }
}