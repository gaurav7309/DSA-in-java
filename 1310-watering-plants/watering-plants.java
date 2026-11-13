class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n  = plants.length;
        int ans   = 0;
        int dublicate = capacity;
        boolean flag = true;
        for(int i = 0;i<n;i++){
            
        if(plants[i]<=capacity){
            capacity-=plants[i];
            ans+=1;
        }
        else if(capacity<plants[i]){
        ans+=i;
        flag = false;
        capacity = dublicate;
        if(flag==false){
            ans+=i+1;
            capacity-=plants[i];
            flag = true;
        }
        }
        
      
        }
        return ans;
    }
}