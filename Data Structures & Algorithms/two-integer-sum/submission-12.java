class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            
            if (seen.containsKey(j)) {
                return new int[]{seen.get(j), i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{0,1};
    }
}
