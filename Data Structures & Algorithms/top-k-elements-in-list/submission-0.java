class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> pool = new HashMap<>();
        int[] res = new int[k];

        for (int num : nums) {
            if (!pool.containsKey(num)) {
                pool.put(num, 1);
            } else {
                pool.put(num, pool.get(num) + 1);
            }
        }

        List<int[]> poolArr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : pool.entrySet()) {
            poolArr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        
        poolArr.sort((a, b) -> b[0] - a[0]);

        for (int i = 0; i < k; i++) {
            res[i] = poolArr.get(i)[1];
        }

        return res;
    }
}
