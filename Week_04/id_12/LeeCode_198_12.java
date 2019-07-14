/**
 * https://leetcode-cn.com/problems/house-robber/submissions/
 * 打家劫舍题目
 * 开的思路肯定是递归, 从底向上的想法, 总结出递归的想法, 然后考虑时间复杂度问题O(2^n), 采用记忆化搜索解决.
 * 最终应该从 DP 思路解决
 */
class Solution {

    private int[] memo;

    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return tryRob(nums, 0);
    }
    private int tryRob(int[] nums, int index) {
        if(index >= nums.length)
            return 0;
        if(memo[index] != -1)
            return memo[index];
        return memo[index] =
                Math.max(tryRob(nums, index + 1), nums[index] + tryRob(nums, index + 2));
    }
}