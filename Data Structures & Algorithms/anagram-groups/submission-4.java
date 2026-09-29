class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> pool = new HashMap<>();

        for (String str : strs) {
            // jeez, I used hint to use char[26] instead of int[26], remeber! dumbass
            char[] fingerprint = new char[26];
            
            for (char ch : str.toCharArray()) {
                fingerprint[ch - 'a']++;
            }

            pool.computeIfAbsent(new String(fingerprint), k -> new ArrayList<>()).add(str);
        }

        return new ArrayList(pool.values());
    }
}
