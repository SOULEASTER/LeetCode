// 题目标题: 最长公共前缀
// 题目标记: longest-common-prefix
// 题目编号: 14	
// 题目描述:
//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 👍 2184 👎 0


// 题目代码:
package leetcode.editor.cn;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix_14().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";
            for (int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (i == strs[j].length() || strs[j].charAt(i) != c) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            return strs[0];
/*
        if (strs.length == 0) {
            return "";
        }
        int minLength = 0;
        String minStr = "";
        for (int i = 0; i < strs.length ; i++) {
            if (i == 0) {
                minLength = strs[i].length();
                minStr = strs[i];
            }
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
                minStr = strs[i];
            }

        }
        for (int i = minLength; i > 0; i--) {
            String test = minStr.substring(0, i - 1);
            if (minStr.length() != 0) {
                boolean isMin = true;
                for (String s : strs) {
                    if (!s.startsWith(test)) {
                        isMin = false;
                        break;
                    }
                }
                if (isMin) {
                    return test;
                }
            } else {
                return minStr;
            }
        }
        return minStr;*/
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}