import java.util.*;
class MyStack {
    Queue<Integer> Q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
    Q.add(x);     
    }
    
    public int pop() {
    for(int i =  0;i<Q.size()-1;i++){
        Q.add(Q.remove());
    }    
    return Q.remove();
    }
    
    public int top() {
     for(int i =  0;i<Q.size()-1;i++){
        Q.add(Q.remove());
    }    
    int temp = Q.peek();
    Q.add(Q.remove());
    return temp;
       
    }
    
    public boolean empty() {
    if(Q.isEmpty()){

        return true;
    }
    else{
        return false;
    }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */