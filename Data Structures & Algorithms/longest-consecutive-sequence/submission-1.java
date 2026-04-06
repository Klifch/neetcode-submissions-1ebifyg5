class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> pool = new HashSet<>();
        int highest = 0;

        for (int i = 0; i < nums.length; i++) {
            pool.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int seqStarter;
            if (!pool.contains(nums[i] - 1)) {
                seqStarter = nums[i];
                int increment = 0;

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
