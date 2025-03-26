class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        int n = nums.length;
        double maxSum = 0, currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxSum = currentSum;

        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k]; 
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }
}
