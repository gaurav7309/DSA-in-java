class Solution {
   public static class pair{
   int first;
   int diff;
   pair(int first,int diff){
    this.first = first;
    this.diff = diff;
   }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
   var result = new ArrayList<Integer>();
    var pq = new PriorityQueue<pair>((a,b)->{
        if(b.diff==a.diff){
            return Integer.compare(b.first,a.first);
        }
        return Integer.compare(b.diff,a.diff);
        });
    int n = arr.length;
    for(int i = 0;i<n;i++){
    pq.add(new pair(arr[i],Math.abs(x-arr[i])));
    if(pq.size()>k){
        pq.remove();
    }
    }
    int p = 0;
    while(pq.size()!=0){
        pair temp = pq.remove();
      result.add(temp.first);
    }
    Collections.sort(result);
    return result;
    }
}