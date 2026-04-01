class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix[i], 0, matrix[i].length-1, target) != -1) {
                return true;
            }
        }
        return false;
    }
    private int binarySearch(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
        
            if (arr[mid] == x) {
                return mid;
            } 

            if (arr[mid] < x) {
                return binarySearch(arr, mid + 1, high, x);
            }

            return binarySearch(arr, low, mid-1, x);
        }
        return -1;
    }
}
