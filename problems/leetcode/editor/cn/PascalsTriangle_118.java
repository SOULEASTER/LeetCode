// 题目标题: 杨辉三角
// 题目标记: pascals-triangle
// 题目编号: 118	
// 题目描述:
//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics 数组 动态规划 👍 741 👎 0


// 题目代码:
package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle_118 {

    public static void main(String[] args) {
        Solution solution = new PascalsTriangle_118().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            if (numRows == 0) {
                return result;
            }
            result.add(Collections.singletonList(1));

            for (int row = 1; row < numRows; row++) {
                List<Integer> curRow = new ArrayList<>();
                List<Integer> preRow = result.get(row - 1);

                curRow.add(1);
                for (int i = 1; i < row; i++) {
                    curRow.add(preRow.get(i - 1) + preRow.get(i));
                }
                curRow.add(1);
                result.add(curRow);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}