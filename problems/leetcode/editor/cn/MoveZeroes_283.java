// 题目标题: 移动零
// 题目标记: move-zeroes
// 题目编号: 283	
// 题目描述:
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
// Related Topics 数组 双指针 👍 1545 👎 0


// 题目代码:
package leetcode.editor.cn;

public class MoveZeroes_283 {

    public static void main(String[] args) {
        Solution solution = new MoveZeroes_283().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[j++] = nums[i];
                }
            }
            for (int i = j; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}