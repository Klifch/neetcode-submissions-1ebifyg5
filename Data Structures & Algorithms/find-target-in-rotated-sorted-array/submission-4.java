class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int index = -1;
        int mid = 0;

        while (l <= r) {

            mid = (r - l) / 2 + l;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[l] == target) {
                return l;
            } else if (nums[r] == target) {
                return r;
            }

            if (nums[mid] >= nums[r]) {
                // left half is sorted
                if (target < nums[mid] && target >= nums[l]) {
                    // target is in the sorted half 
                    r = mid - 1;
                } else {
                    // target is in the non-sorted half
                    l = mid + 1;
                }
            } else {
                // right half is sorted
                if (target > nums[mid] && target <= nums[r]) {
                    // target is in the sorted half
                    l = mid + 1;
                } else {
                    // target is in the non-sorted half
                    r = mid - 1;
                }
            }
        }

        return index;
    }
}
