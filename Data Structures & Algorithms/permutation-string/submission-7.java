class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int[] comp = new int[26];
        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            comp[ch - 'a']++;
        }

        for (int r = 0; r < s2.length(); r++) {
            freq[s2.charAt(r) - 'a']++;

            if (r - l + 1 > s1.length()) {
                freq[s2.charAt(l) - 'a']--;
                
                l++;
            }

            if (Arrays.equals(comp, freq)) {
                return true;
            }
        }

        return false;
    }
}
