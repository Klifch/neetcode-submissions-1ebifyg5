class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> pool = new HashMap<>();
        
        for (String s : strs) {
            int[] fingerPrint = new int[26];
            
            for (char ch : s.toCharArray()) {
                fingerPrint[ch - 'a']++;
            }
            
            pool.computeIfAbsent(Arrays.toString(fingerPrint), k -> new ArrayList()).add(s);
        }

        return new ArrayList(pool.values());
    }
}
