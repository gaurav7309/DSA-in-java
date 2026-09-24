class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {
        
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        int temp = st2.pop();

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

        return temp;
    }

    public int peek() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        int temp = st2.peek();

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }

        return temp;
    }

    public boolean empty() {
        return st1.isEmpty();
    }
}