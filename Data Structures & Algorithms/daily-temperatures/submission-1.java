class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (stack.size() != 0 && stack.peek()[0] < temperatures[i]) {
                res[stack.peek()[1]] = i - stack.pop()[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }

        for (int[] tuple : stack) {
            res[tuple[1]] = 0;
        }

        return res;
    }
}
