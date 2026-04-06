class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> res = new HashSet<>();
        Integer maxLen = Integer.MIN_VALUE;
        int l = 0;

        // if (s.length() == 1) {
        //     return 1;
        // }
        
        for (int r = 0; r < s.length(); r++) {
            while (res.contains(s.charAt(r)) && l < r) {
                res.remove(s.charAt(l));
                l++;
            }
            res.add(s.charAt(r));
            maxLen = Math.max(maxLen, res.size());
        }

        if (maxLen == Integer.MIN_VALUE) {
            return 0;
        }

        return maxLen;
    }
}
