class MinStack {
    private Stack<Integer> minStack;
    private List<Integer> stack;

    public MinStack() {
        this.minStack = new Stack<>();
        this.stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if (minStack.size() == 0 || val <= minStack.peek()) {
            minStack.push(val);
        }
        stack.add(val);
    }
    
    public void pop() {
        if (minStack.peek().equals(stack.get(stack.size() - 1))) {
            minStack.pop();
        }
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
