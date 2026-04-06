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
                // System.out.println("Inside populate: Processing = " + nums[r] + "; Current r = " + r);
                // System.out.println("Current window before processing: " + window);
                if (window.contains(nums[r])) {
                    return true;
                }
                window.add(nums[r]);
                r++;
                // System.out.println("Inside populate window after proc: " + window);
            }

            // System.out.println("Outside Populate: Processing = " + nums[r] + " At index r = " + r);
            if (window.contains(nums[r])) {
                return true;
            }


            window.add(nums[r]);
            r++;
            // System.out.println("After addin r Current window: " + window);

            window.remove(nums[l]);
            l++;

            // System.out.println("After rmoving L Current window: " + window);
        }

        return false;
    }
}