class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> pool = new HashSet<>();
        int highest = 0;

        for (int num : nums) {
            pool.add(num);
        }

        for (int elem : pool) {
            int seqStarter;
            if (!pool.contains(elem - 1)) {
                seqStarter = elem;
                int increment = 1;

                while (pool.contains(seqStarter + increment)) {
                    increment++;
                }
                if (increment > highest) {
                    highest = increment;
                }
            }
        }

        return highest;
    }
}
