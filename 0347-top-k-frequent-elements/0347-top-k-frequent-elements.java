class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> (freqMap.get(a) - freqMap.get(b)));

        for (int num : freqMap.keySet()) {
            minheap.offer(num);

            if (minheap.size() > k) {
                minheap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            ans[i] = minheap.poll();
        }

        return ans;
    }
}
