class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer need = seen.get(target - nums[i]);
            
            if (need != null) {
                return new int[]{need, i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{0,1};
    }
}
