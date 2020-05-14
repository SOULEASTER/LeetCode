//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
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
