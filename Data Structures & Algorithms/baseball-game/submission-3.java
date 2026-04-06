class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (Character.isDigit(operations[i].charAt(0)) ||
                (operations[i].charAt(0) == '-' && operations[i].length() > 1)
            ) {
                stack.push(Integer.parseInt(operations[i]));
            } else if (operations[i].equals("+")) {
                int pop = stack.pop();
                int peek = stack.peek();
                stack.push(pop);
                stack.push(pop + peek);
            } else if (operations[i].equals("D")) {
                stack.push(2 * stack.peek());
            } else if (operations[i].equals("C")) {
                stack.pop();
            }
        }

        for (int i : stack) {
            sum += i;
        }

        return sum;
    }
}