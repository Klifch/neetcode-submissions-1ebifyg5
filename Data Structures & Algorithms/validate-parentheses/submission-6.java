class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(') {
                stack.add(')');
            } else if (currChar == '{') {
                stack.add('}');
            } else if (currChar == '[') {
                stack.add(']');
            } else {
                if (stack.size() > 0 && stack.get(stack.size() - 1) == currChar) {
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
