class MinStack {
    Stack<Long> st = new Stack<>();
    long min = -1;

    public MinStack() {
    }
    
    public void push(int value) {
        long x = (long)value;
        if(st.size() == 0){
            st.push(x);
            min = x;
        }
        else if(x >= min){
            st.push(x);
        }
        else {
            st.push(2*x - min);
            min = x;
        }
    }
    
    public void pop() {
        if(st.size() == 0) return;
        if(st.peek() >= min){
            st.pop();
        }
        else{
            long oldMin = 2*min - st.peek();
            min = oldMin;
            st.pop();
        }
    }
    
    public int top() {
        if(st.size() == 0) return -1;
        long q = st.peek();
        if(q >= min)
            return (int)q;
        return (int)min;
    }
    
    public int getMin() {
        if(st.size() == 0) return -1;
        return (int)min;
    }
}