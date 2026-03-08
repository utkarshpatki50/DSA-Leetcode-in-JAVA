class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < n) {
            nums[index++] = 0;
        }
    }
}