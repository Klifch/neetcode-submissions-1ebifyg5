class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int l = 0;
        int r = l;

        if (nums.length < 2) {
            return false;
        }

        while (r < nums.length) {
            while (r - l != k) {
                if (window.contains(nums[r])) {
                    return true;
                }
                window.add(nums[r]);
                r++;
            }

            if (window.contains(nums[r])) {
                return true;
            }


            window.add(nums[r]);
            r++;

            window.remove(nums[l]);
            l++;
        }

        return false;
    }
}