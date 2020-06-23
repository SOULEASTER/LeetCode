// 题目标题: 3的幂
// 题目标记: power-of-three
// 题目编号: 326	
// 题目描述:
//给定一个整数，写一个函数来判断它是否是 3 的幂次方。 
//
// 示例 1: 
//
// 输入: 27
//输出: true
// 
//
// 示例 2: 
//
// 输入: 0
//输出: false 
//
// 示例 3: 
//
// 输入: 9
//输出: true 
//
// 示例 4: 
//
// 输入: 45
//输出: false 
//
// 进阶： 
//你能不使用循环或者递归来完成本题吗？ 
// Related Topics 数学


// 题目代码:
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfThree(int n) {
//        if (n == 1) {
//            return true;
//        }
//        int result = 3;
//        while (result <= n) {
//            if (result == n) {
//                return true;
//            }
//            result = result * 3;
//        }
//        return false;
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
