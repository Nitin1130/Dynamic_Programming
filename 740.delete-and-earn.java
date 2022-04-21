import java.util.HashMap;

/*
 * @lc app=leetcode id=740 lang=java
 *
 * [740] Delete and Earn
 */

// @lc code=start
class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> points = new HashMap<>();
        int maxnumber = 0;
        for(int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxnumber = Math.max(maxnumber, num);

        }
        int[] maxpoints = new int[maxnumber + 1];
        maxpoints[1] = points.getOrDefault(1, 0);
        
        for(int num = 2; num < maxpoints.length; num++) {
            int gain = points.getOrDefault(num,0);
            maxpoints[num] = Math.max(maxpoints[num - 1], maxpoints[num - 2] + gain);
        }
        return maxpoints[maxnumber];
    }
}
// @lc code=end

