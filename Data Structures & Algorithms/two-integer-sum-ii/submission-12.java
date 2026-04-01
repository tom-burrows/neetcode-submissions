class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int tmp;
        int val;

        for (int i = 0; i < n; i++) {
            tmp = target - numbers[i];
            System.out.println("TMP: "+tmp);

            System.out.println("Starting binary search..." ) ;
            val = binarySearch(numbers, i, n-1, tmp);
            System.out.println("Val: " + val);

            if (val != -1) {

                
                return new int[] {i+1, findTmp(numbers, i, tmp)};
            }
        }

        return new int[0];
    }
    private int findTmp(int[] numbers, int i, int tmp){
        while(true) {
            if(numbers[i] != tmp) {
                i++;
            } else {
                return i+1;
            }
        }

    }

    private int binarySearch(int[] arr, int low, int high, int tmp) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            System.out.println(mid);

            if (arr[mid] == tmp) {
                return tmp;
            }

            if (arr[mid] > tmp)
                return binarySearch(arr, low, mid - 1, tmp);

            
            return binarySearch(arr, mid + 1, high, tmp);
        }
        return -1;
    }
}
