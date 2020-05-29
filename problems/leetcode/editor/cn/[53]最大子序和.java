 // 题目标记: maximum-subarray
// 题目编号: 53	
// 题目描述:
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
/*        int sum = Integer.MIN_VALUE;
        if (nums.length == 1) {
            sum = nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int s = 0;
                for (int k = i; k <= j; k++) {
                    s += nums[k];
                    if (s > sum) {
                        sum = s;
                    }
                }
            }
        }
        return sum;*/

        int pre = 0;
        int maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
