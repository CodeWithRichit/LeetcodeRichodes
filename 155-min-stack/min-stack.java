class MinStack {
    Stack<Integer> obj;
    Stack<Integer> mins;
    public MinStack() {
        obj = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int value) {
        obj.push(value);
        if(obj.size()==1)mins.push(value);
        else{
            if(obj.peek()<mins.peek()){
                mins.push(obj.peek());
            }
            else{
                mins.push(mins.peek());
            }
        }
    }
    
    public void pop() {
        mins.pop();
       obj.pop();
    }
    
    public int top() {
      return  obj.peek();
    }
    
    public int getMin() {
        return mins.peek();
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