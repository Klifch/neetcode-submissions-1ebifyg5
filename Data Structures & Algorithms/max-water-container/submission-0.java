class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;

        while (l < r) {
            int tmp = (r - l) * Math.min(heights[l], heights[r]);
            if (tmp > max) {
                max = tmp;
            }

            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }

        return max;
    }
}
