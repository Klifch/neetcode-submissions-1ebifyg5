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
        System.out.println("MinStack peek: " + minStack.peek() + " Main stack peek: " + stack.get(stack.size() - 1));
        if (minStack.peek().equals(stack.get(stack.size() - 1))) {
            System.out.println("If statement worked");
            minStack.pop();
        }
        stack.remove(stack.size() - 1);
        System.out.println("Min stack: " + minStack);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
