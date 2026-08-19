class Solution {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (mp.containsKey(need)) {
                return new int[] { i, mp.get(need) };
            } else {
                mp.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
}
