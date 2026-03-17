class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 0;
        // int index=0;

        for (int fast = 1; fast < n; fast++) {
            if (nums[fast] != nums[slow])
                slow++;

            nums[slow] = nums[fast];
        }
        return slow + 1;
    }
}