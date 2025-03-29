import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0; // If less than 2 elements, return 0

        Arrays.sort(nums); // Sort the array

        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]); // Compare consecutive elements
        }

        return maxGap;
    }
}
