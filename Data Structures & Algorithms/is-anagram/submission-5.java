class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        String sCopy = s;
        String tCopy = t;
        
        for (char ch : s.toCharArray()) {
            sCopy = sCopy.replace(String.valueOf(ch), "");
            tCopy = tCopy.replace(String.valueOf(ch), "");

            if (sCopy.length() != tCopy.length()){
                return false;
            }
        }

        return true;
    }
}
