class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freq.get(b) - freq.get(a));
        maxHeap.addAll(freq.keySet());

        StringBuilder ans = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();

            int frq = freq.get(ch);

            for (int i = 0; i < frq; i++) {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}