class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Iterator temp: " + temperatures[i]);
            while (stack.size() != 0 && stack.peek()[0] < temperatures[i]) {
                System.out.println("Processing in while loop: " + stack.peek()[0]);
                System.out.println("We will put diff: " + i + "-" + stack.peek()[1] + "=" + (i - stack.peek()[1]) + " at res index " + i);
                res[stack.peek()[1]] = i - stack.pop()[1];
            }
            System.out.println("After the loop we put to stack: " + "[" + temperatures[i] + "," + i + "]");
            stack.push(new int[]{temperatures[i], i});
        }

        for (int[] tuple : stack) {
            res[tuple[1]] = 0;
        }

        return res;
    }
}
