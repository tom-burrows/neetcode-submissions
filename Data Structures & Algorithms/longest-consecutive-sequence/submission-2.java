class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Collections.sort(numbers);

        HashMap<Integer, Integer> results = new HashMap<>();
        int cur = 1;
        int longest = 1;
        int last = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) == last) {
                continue;
            }
            if (numbers.get(i) == last+1) {
                cur++;
            } else {
                if (cur > longest) {
                    longest = cur;
                }
                cur = 1;
            }
            last = numbers.get(i);
            
        }
        if (cur > longest) {
            return cur;
        }
        return longest;
    }
}
