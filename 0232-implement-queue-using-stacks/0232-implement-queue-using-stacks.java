class MyQueue {
Stack<Integer> input;
Stack<Integer> output;
  int peeE=-1;
    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }
    
    public void push(int x) {
        if(input.isEmpty()){
            peeE=x;
        }
        input.push(x); 
    }
    
    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
        }
        int val=output.peek();
        output.pop();
        return val;
        
    }
    
    public int peek() {
        if(output.isEmpty()){
           return peeE;
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.isEmpty() && output.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */