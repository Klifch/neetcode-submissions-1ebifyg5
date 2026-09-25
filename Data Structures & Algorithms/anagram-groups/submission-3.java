class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // first pool - annagrams to thiers fingerprint
        Map<String, List<String>> pool = new HashMap<>();

        // go over every string
        for (String s : strs) {
            char[] chars = new char[26];

            // compute fingerprint for each string
            for (char ch : s.toCharArray()) {
                chars[ch - 'a']++;
            }

            // check if key fingerprint is absent
            // if yes -> associate fingerprint key with current string
            // otherwise add current string to existing fingerprint array
            pool.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(pool.values());
    }
}
