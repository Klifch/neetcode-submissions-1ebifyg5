class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int upperB = 0;
        int l = 1;
        int timeAtMid = 0;
        int minK = Integer.MAX_VALUE;
        int mid = 0;

        for (int pile : piles) {
            upperB = Math.max(pile, upperB);
        }

        minK = upperB;

        while (l <= upperB) {
            mid = (upperB - l) / 2 + l;
            timeAtMid = 0;

            for (int pile : piles) {
                timeAtMid += (int) Math.ceil((double) pile / mid);
            }

            if (timeAtMid > h) {
                l = mid + 1;
            } else if (timeAtMid <= h) {
                upperB = mid - 1;
                minK = Math.min(minK, mid);
            }
        }

        return minK;
    }
}
