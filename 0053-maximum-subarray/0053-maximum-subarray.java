class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currsum = nums[0], maxi = nums[0];
        for (int i = 1; i < n; i++) {
            currsum = Math.max(nums[i], currsum += nums[i]);
            maxi = Math.max(currsum, maxi);
        }
        return maxi;
    }
}