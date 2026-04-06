class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int idk = 1;
        int zeroCount = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                idk *= nums[i];
            } else {
                zeroCount++;
            }
        }

        for (int i = 0; i < len; i++) {
            if (zeroCount > 1) {
                res[i] = 0;
            } else if (zeroCount > 0 && nums[i] != 0) {
                res[i] = 0;
            } else if (zeroCount > 0 && nums[i] == 0) {
                res[i] = idk;
            } else {
                res[i] = idk / nums[i];
            }
        }

        return res;
    }
}  
