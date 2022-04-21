/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        if(nums.length <= 1) 
            return 0;
        
        if(nums[0] == 0)
            return -1;
        
        int maxReach = nums[0];
        int step = nums[0];
        int jump = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(i == nums.length - 1)
                return jump;
            
            
            maxReach = Math.max(maxReach, i + nums[i]);
            
            step--;
            
            if(step == 0) {
                jump++;
                if(i >= maxReach)
                    return -1;
                
                step = maxReach - i;
            }
        }
        return -1;
    }
}
// @lc code=end

