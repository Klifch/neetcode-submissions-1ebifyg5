class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int aim = 0;
        int l = 0;
        int total = 0;
        int[] comp = new int[26];
        int[] freq = new int[26];

        for (char ch : s1.toCharArray()) {
            aim += ch;
            comp[ch - 'a']++;
        }

        for (int r = 0; r < s2.length(); r++) {
            total += s2.charAt(r);
            freq[s2.charAt(r) - 'a']++;

            if (r - l + 1 > s1.length()) {
                total -= s2.charAt(l);
                freq[s2.charAt(l) - 'a']--;
                
                l++;
            }

            if (total == aim && Arrays.equals(comp, freq)) {
                return true;
            }
        }

        return false;
    }
}
