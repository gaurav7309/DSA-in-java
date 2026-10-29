class Solution {
    public static class pair{
    int ele;
    int fre;
    pair(int ele,int fre){
        this.ele = ele;
        this.fre = fre;
    }

    }
    public int minSetSize(int[] arr) {
    var pq = new PriorityQueue<pair>((a,b)->{
    if(b.fre==a.fre){
        return Integer.compare(b.ele,a.ele);
    }
    return Integer.compare(b.fre,a.fre);
    });
    int n = arr.length;
    // first srote it in the map then the pq\
    var map = new HashMap<Integer,Integer>();
    for(int i = 0;i<n;i++){
    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }

     for(int key:map.keySet()){
     pq.add(new pair(key,map.get(key)));
     }
     int check = n;
     int ans = 0;
    while(pq.size()!=0 && check>n/2){
    pair left = pq.remove();
    ans++;
    check-=left.fre;
    } 
    return ans;
    }
}