class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      HashMap<Integer,Integer> loss  = new HashMap<>();
      
      List<List<Integer>> ans = new ArrayList<>();
      ArrayList<Integer> win1 = new ArrayList<>();
      ArrayList<Integer> loss1 = new ArrayList<>();
      for(int [] match: matches){
        int winner = match[0];
        int losser = match[1];
        loss.put(losser,loss.getOrDefault(losser,0)+1);

        // if(loss.containsKey(winner)){
        //     if(loss.get(winner)==1){
        //         loss.add(winner);
        //     }
        // }

      } 
// for the calculation the winner that are not the losser
       HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> st1 = new HashSet<>();
      for(int [] match: matches){
        int winner = match[0];
        int losser = match[1];
         if(!loss.containsKey(winner)){
          st1.add(winner);
         }
         if(loss.containsKey(winner)){
            if(loss.get(winner)==1){
                st.add(winner);
            }
        }
        if(loss.containsKey(losser)){
            if(loss.get(losser)==1){
                st.add(losser);
            }
        }

      }
      for(int key:st1){
        win1.add(key);

      } 
      Collections.sort(win1);

      for(int key:st){
        loss1.add(key);

      } 
       Collections.sort(loss1);
       ans.add(win1);
       ans.add(loss1);
       return ans;


    }
}