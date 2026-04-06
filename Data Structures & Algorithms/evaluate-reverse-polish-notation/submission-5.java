class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            System.out.println("Processing: '" + s + "'");
            if (s.equals("+")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1 + n2);
            } else if (s.equals("-")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 - n1);
            } else if (s.equals("*")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n1 * n2);
            } else if (s.equals("/")) {
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2 / n1);
            } else {
                stack.push(Integer.parseInt(s));
            }
            System.out.println(stack);
        }

        return stack.peek();
    }
}
