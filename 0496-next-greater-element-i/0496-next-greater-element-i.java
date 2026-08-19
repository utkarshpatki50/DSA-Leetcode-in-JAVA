class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        HashMap<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int curr = nums2[i];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if (st.isEmpty()) {
                ngeMap.put(curr, -1);
            } else {
                ngeMap.put(curr, st.peek());
            }

            st.push(curr);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length ; i++) {
            ans[i] = ngeMap.get(nums1[i]);
        }

        return ans;
    }
}
