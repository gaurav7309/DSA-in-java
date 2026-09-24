import java.util.*;

public class RecentCounter{
     Queue<Integer> Q = new LinkedList<>();  

    public RecentCounter() {
    
    }
    
    public int ping(int t) {
     Q.add(t);
     int temp = t-3000;
    
     while(!Q.isEmpty() && Q.peek()<temp){
     Q.remove();
     } 
     
     
    
     return Q.size(); 
}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */