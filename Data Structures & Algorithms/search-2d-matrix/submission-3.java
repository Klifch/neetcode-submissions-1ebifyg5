class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int r = matrix[0].length - 1;
            int mid = 0;
            
            while (l <= r) {
                mid = (l + r) / 2;
                if (target > matrix[i][mid]) {
                    l = mid + 1;
                } else if (target < matrix[i][mid]) {
                    r = mid - 1;
                } else {
                    return true;
                }
            }
        }

        return false;
    }
}
