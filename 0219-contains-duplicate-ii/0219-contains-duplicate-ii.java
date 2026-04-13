class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(nums[i])) {
                if (i - mp.get(nums[i]) <= k) {
                    return true;
                }
            }
            mp.put(nums[i], i);
        }
        return false;
    }
}
