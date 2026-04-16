class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        int min = Integer.MAX_VALUE;

        while (l < r) {
            mid = (r + l) / 2;
            // min = Math.min(min, nums[mid]);

            // if (nums[l] < nums[mid]) {
            //     l = mid + 1;
            // } else
            if (nums[mid] < nums[r]) {
                r = mid;
            } else  {
                l = mid + 1;
            }
            //  else {
            //     return nums[mid];
            // }
        }

        return nums[l];
    }
}
