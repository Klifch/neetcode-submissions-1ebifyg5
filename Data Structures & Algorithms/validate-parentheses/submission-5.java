class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            System.out.println("currchar: " + currChar);
            if (currChar == '(') {
                stack.add(')');
            } else if (currChar == '{') {
                stack.add('}');
            } else if (currChar == '[') {
                stack.add(']');
            } else {
                System.out.println("currchar is not opening: " + currChar);
                if (stack.size() > 0 && stack.get(stack.size() - 1) == currChar) {
                    System.out.println("Currchar == cahr int the stack which is: " + stack.get(stack.size() - 1));
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
