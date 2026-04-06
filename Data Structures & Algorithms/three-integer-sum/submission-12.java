class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int lastI = -1000;

        for (int i = 0; i < nums.length - 1; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int total = -1000;
            int lastL = -1000;
            int lastR = -1000;

            if (lastI == nums[i]) {
                continue;
            } else {
                lastI = nums[i];
            }
            
            
            while (l < r) {

                total = nums[l] + nums[r] + nums[i];
                
                if (total == 0) {
                    res.add(Arrays.asList(nums[l], nums[r], nums[i]));
                    lastL = nums[l];
                    lastR = nums[r];
                    
                    while (lastL == nums[l] && l < r) {
                        l++;
                    }
                }

                // lastL = nums[l];
                // lastR = nums[r];

                if (total < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return res;
    }
}
