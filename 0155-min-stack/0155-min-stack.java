class MinStack {
    ArrayList<Integer> arr;
    ArrayList<Integer> mini;

    public MinStack() {
        arr = new ArrayList<>();
        mini = new ArrayList<>();
    }
    
    public void push(int value) {
        arr.add(value);
        if (mini.isEmpty()) {
            mini.add(value);
        } else {
            mini.add(Math.min(mini.get(mini.size() - 1), value));
        }
    }
    
    public void pop() {
        if (!arr.isEmpty()) {
            arr.remove(arr.size() - 1);
            mini.remove(mini.size() - 1);
        }   
    }
    
    public int top() {
        if(arr.isEmpty()) return -1;
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        if(mini.isEmpty()) return -1;
        return mini.get(mini.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */