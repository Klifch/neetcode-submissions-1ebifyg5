class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> pool = new HashMap<>();

        for (String s : strs) {
            char[] chars = new char[26];
            // holder for a key calc
            // converting key to a string

            for (char ch : s.toCharArray()) {
                chars[ch - 'a']++;
            }

            pool.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(s);
            // check if key exists in a map, add value if exists otherwise add a key
            // convert pool to the output fomrat and return
            
        }

        return new ArrayList<>(pool.values());
    }
}
