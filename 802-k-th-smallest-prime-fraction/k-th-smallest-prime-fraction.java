class Solution {
    public class Pair_fraction{
        int first;
        int second;
        double frac;
        Pair_fraction(int first, int second,double third){
            this.first = first;
            this.second = second;
            this.frac = third;
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
      int n = arr.length;
      PriorityQueue<Pair_fraction> pq = new PriorityQueue<>((a,b) -> Double.compare(b.frac,a.frac));


      for(int i = 0;i<n-1;i++){
        for(int j = i+1;j<n;j++){
        pq.add(new Pair_fraction(arr[i],arr[j],(double) arr[i]/arr[j]));
        if(pq.size()>k){
        pq.remove();
        }
        }
      } 
      Pair_fraction temp = pq.peek();
     
      return new int[]{temp.first,temp.second};
    }
}