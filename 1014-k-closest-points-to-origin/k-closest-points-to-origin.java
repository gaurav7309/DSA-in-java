class Solution {
    public class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
      HashMap<Double,ArrayList<pair>> mp = new HashMap<>();
      PriorityQueue<Double> pq = new PriorityQueue<>();
      int[][] ans = new int[k][2];

      for(int [] point:points){
        int left = point[0];
        int right = point[1];
        double temp = Math.sqrt(Math.pow((left-0),2)+Math.pow((right-0),2));
        mp.putIfAbsent(temp,new ArrayList<>());
        mp.get(temp).add(new pair(left,right));
        pq.add(temp);

      }  
      int i1 = 0; 
      while(k-->0){
      double temp = pq.remove();
     pair g =  mp.get(temp).remove(0);
     
      ans[i1][0] = g.first;
      ans[i1++][1] = g.second;
      if(mp.get(temp).isEmpty()){
        mp.remove(temp);
      }
      }
      return ans;
    }
}