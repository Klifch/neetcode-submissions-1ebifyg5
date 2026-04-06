class Solution {
    public int removeElement(int[] nums, int val) {
        int shift = 0;
        int k = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                shift++;
                k--;
            } else {
                nums[i - shift] = nums[i];
            }
        }
        
        return k;
    }
}