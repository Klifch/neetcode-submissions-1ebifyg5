class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        String sCopy = s;
        String tCopy = t;
        
        for (char ch : s.toCharArray()) {
            sCopy = sCopy.replaceFirst(String.valueOf(ch), "");
            tCopy = tCopy.replaceFirst(String.valueOf(ch), "");

            if (sCopy.equals(tCopy)){
                System.out.println(sCopy);
                System.out.println(tCopy);
                return true;
            }
        }

        return false;
    }
}
