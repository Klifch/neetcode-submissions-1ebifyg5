class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> pool = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : nums) {
            pool.put(num, pool.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : pool.entrySet()) {
            int val = e.getValue();
            if (buckets[val] == null) {
                buckets[val] = new ArrayList();
            }
            buckets[val].add(e.getKey());
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
