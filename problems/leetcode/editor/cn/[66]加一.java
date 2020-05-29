// 题目标题: 加一
// 题目标记: plus-one
// 题目编号: 66	
// 题目描述:
//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int sum = 0;
        int prev = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1) {
                digits[i]++;
            }
            sum = digits[i] + prev;
            prev = sum / 10;
            digits[i] = sum % 10;
        }
        if (prev != 0) {
            int[] clone = digits.clone();
            digits = new int[length + 1];
            digits[0] = 1;
            for (int i = 0; i < length-1; i++) {
                digits[i + 1Å] = clone[i];
            }
        }
        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
