class MinStack {

    Stack<Integer> st;
    Stack<Integer> minStack= new Stack<>();
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
    if (minStack.isEmpty() || val <= minStack.peek()) {
        minStack.push(val);
    } else {
        minStack.push(minStack.peek());
    }
    st.push(val);
}

        
    
    public void pop() {
        st.pop();
        minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
