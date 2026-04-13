class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    count++;
                    current++;
                }
                maxlen = Math.max(maxlen, count);
            }
        }
        return maxlen;

    }
}