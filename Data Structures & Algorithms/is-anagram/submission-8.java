class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        
        if (sLen != t.length()) {
            return false;
        }
        
        int[] pool = new int[26];

        for (int i = 0; i < sLen; i++) {
            pool[s.charAt(i) - 'a']++;
            pool[t.charAt(i) - 'a']--;
        }

        for (int n : pool) {
            if (n != 0) {
                return false;
            }
        }
        
        return true;
    }
}
