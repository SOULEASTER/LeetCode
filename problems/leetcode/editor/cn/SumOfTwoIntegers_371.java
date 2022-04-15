// 题目标题: 两整数之和
// 题目标记: sum-of-two-integers
// 题目编号: 371	
// 题目描述:
//给你两个整数 a 和 b ，不使用 运算符 + 和 - ，计算并返回两整数之和。 
//
// 
//
// 示例 1： 
//
// 
//输入：a = 1, b = 2
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：a = 2, b = 3
//输出：5
// 
//
// 
//
// 提示： 
//
// 
// -1000 <= a, b <= 1000 
// 
// Related Topics 位运算 数学 👍 602 👎 0


// 题目代码:
package leetcode.editor.cn;

public class SumOfTwoIntegers_371 {

    public static void main(String[] args) {
        Solution solution = new SumOfTwoIntegers_371().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int getSum(int a, int b) {
            if (a == 0) return b;
            if (b == 0) return a;
            int lower;
            int carrier;
            while (true) {
                lower = a ^ b;    // 计算低位
                carrier = a & b;  // 计算进位
                if (carrier == 0) break;
                a = lower;
                b = carrier << 1;
            }
            return lower;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}