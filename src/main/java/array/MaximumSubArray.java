package array;

class MaximumSubArray {

    /*
    * Source: https://leetcode.com/problems/maximum-subarray/
    *
    * Solution description:
    * This is O(n) pretty nice DP solution.
    * We iterate one through given array and check what is greater: actual subarray sum+next element or just next element.
    * If next element is greater, then we start new subarray with it. If it's not greater, we add it to the subarray.
     */

    int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];

        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    /*
    * Same as the solution above but without DP.
     */
    int maxSubArrayNoDP(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }

    /*
    * This is O(n^2) solution, not very efficient.
    * We just compare every subarray in the input array.
     */
    int maxSubArraySlow(int[] nums) {
        int max = -2147483647;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
            sum = 0;
        }
        return max;
    }
}
