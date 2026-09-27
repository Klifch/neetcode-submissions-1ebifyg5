class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> pool = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            pool.put(nums[i], pool.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : pool.entrySet()) {
            if (buckets[e.getValue()] == null) {
                buckets[e.getValue()] = new ArrayList<>();
            }
            
            buckets[e.getValue()].add(e.getKey());
        }

        int left = k;
        int[] result = new int[k];

        for (int i = nums.length; left != 0; i--) {
            if (buckets[i] != null) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    result[left - 1] = buckets[i].get(j);
                    
                    left--;
                    if (left == 0) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
