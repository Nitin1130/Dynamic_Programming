/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        int n = nums.length;
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));

    }
    public int rob(int[] nums, int i, int j) {
        int dp[] = new int[nums.length];
        dp[i] = nums[i];
        dp[i + 1] = Math.max(nums[i], nums[i+1]);
        for(int k = i + 2; k <= j; k++) {
            dp[k] = Math.max(dp[k - 1], nums[k] + dp[k - 2]); 

        }
        return dp[j];
    }
}
// @lc code=end

