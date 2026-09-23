class Solution {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int currsum = 0;

        for (int i = 0; i < n; i++) {
            currsum = Math.max(currsum + nums[i], nums[i]);
            maxi = Math.max(currsum, maxi);
        }
        return maxi;
    }
}
