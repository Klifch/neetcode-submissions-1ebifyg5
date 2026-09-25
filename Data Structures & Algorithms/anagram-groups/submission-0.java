class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> pool = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            int[] fingerprint = new int[26];
            
            for (int j = 0; j < strs[i].length(); j++) {
                fingerprint[strs[i].charAt(j) - 'a']++;
            }

            if (!pool.containsKey(Arrays.toString(fingerprint))) {
                List<String> val = new ArrayList<>();
                val.add(strs[i]);
                pool.put(Arrays.toString(fingerprint), val);
            } else {
                pool.get(Arrays.toString(fingerprint)).add(strs[i]);
            }
        }

        return new ArrayList<>(pool.values());
    }
}
