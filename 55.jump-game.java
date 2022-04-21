/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int destination = n - 1;
        for(int i = n - 2; i >= 0; i--) {
            if(i + nums[i] >= destination) destination = i;
        }
        return destination == 0;
    }
}
// @lc code=end

