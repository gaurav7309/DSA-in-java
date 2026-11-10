import java.util.*;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
      List<List<Integer>>  ans = new ArrayList<>();
      int n = nums.length;
    //   // convert the nums to the temp arraylist
    //   ArrayList<Integer> temp = new ArrayList<>();
    //   for(int i = 0;i<n;i++){
    //   temp.add(nums[i]);
    //   }

    //   for(int i = 0;i<temp.size();i++){
    //   ArrayList<Integer> memp = new ArrayList<>();
    //   HashSet<Integer> st = new HashSet<>();
    //   for(int j = 0;j<temp.size();j++){
    //     st.add(temp.get(j));
    //   }
      
    //   for(int key: st){
    //   temp.add(key);
    //   }
    //   ans.add(temp);
    //   }  
    LinkedHashMap<Integer, Integer> mp =  new LinkedHashMap<>();

         for(int i = 0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
         }
         while(mp.size()!=0){
         ArrayList<Integer> temp = new ArrayList<>(); 
         Iterator<Integer> it = mp.keySet().iterator();

         while(it.hasNext()){
            int key = it.next();
            
            temp.add(key);
            mp.put(key,mp.get(key)-1);
            if(mp.get(key)==0){
                it.remove();
            }

         }
         ans.add(temp);
         }
      return ans;
    }
}