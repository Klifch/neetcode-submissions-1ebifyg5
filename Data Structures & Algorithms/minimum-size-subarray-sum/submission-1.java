class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total = 0;
        int l = 0;
        Integer minLen = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            // System.out.println("Processing val = " + nums[r] + " At r index = " + r);
            total += nums[r];
            while (total >= target) {
                // System.out.println("Total > target: " + total + " > " + target + " Saved minlen is: " + minLen + " current distance: " + (r - l + 1));
                minLen = Math.min(minLen,r - l + 1);
                // System.out.println("So removing current L val = " + nums[l] + " At idnex L = " + l);
                total -= nums[l];
                l++;
            }
            
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;
    }
}