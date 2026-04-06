class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n1 = 0;
        int n2 = 0;
        for (String s : tokens) {
            if (s.equals("+")) {
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n1 + n2);
            } else if (s.equals("-")) {
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n2 - n1);
            } else if (s.equals("*")) {
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n1 * n2);
            } else if (s.equals("/")) {
                n1 = stack.pop();
                n2 = stack.pop();
                stack.push(n2 / n1);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();
    }
}
