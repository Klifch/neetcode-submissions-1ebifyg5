class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> res = new HashSet<>();
        int maxLen = 0;
        int l = 0;
        
        for (int r = 0; r < s.length(); r++) {
            while (res.contains(s.charAt(r)) && l < r) {
                res.remove(s.charAt(l));
                l++;
            }
            res.add(s.charAt(r));
            maxLen = Math.max(maxLen, res.size());
        }

        return maxLen;
    }
}
