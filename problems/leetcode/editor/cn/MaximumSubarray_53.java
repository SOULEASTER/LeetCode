// 题目标题: 最大子数组和
// 题目标记: maximum-subarray
// 题目编号: 53	
// 题目描述:
//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 子数组 是数组中的一个连续部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [5,4,-1,7,8]
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 👍 4749 👎 0


// 题目代码:
package leetcode.editor.cn;

public class MaximumSubarray_53 {

    public static void main(String[] args) {
        Solution solution = new MaximumSubarray_53().new Solution();
    }

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

}