class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int moreNeeded = target - nums[i];
            if (mp.containsKey(moreNeeded)) {
                ans[0] = i;
                ans[1] = mp.get(moreNeeded);
            } else {
                mp.put(nums[i], i);
            }
        }
        return ans;
    }
}